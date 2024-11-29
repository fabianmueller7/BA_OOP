import java.util.Scanner;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class mainTemp {

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        final Logger LOG = LoggerFactory.getLogger(main.class);
        User listener = new User("listener1");
        temperaturVerlauf.addPropertyChangeListener(listener);

        do {
            System.out.println("Bitte Temperatur eingeben (oder 'exit' zum Beenden): ");
            input = scanner.next();
            try{
                float value = Float.valueOf(input);
                temperaturVerlauf.add(Temperatur.createFromCelsius(value));
            } catch (Exception e) {

                if(input.equals("exit")) {
                    break;
                }

                LOG.warn(e.getMessage());
                LOG.error("Bitte geben Sie eine Zahl eingeben.");
            }

        } while (true);

        LOG.info("\n"+ temperaturVerlauf.toString());

        LOG.info("Programm beendet.");
    }
}
