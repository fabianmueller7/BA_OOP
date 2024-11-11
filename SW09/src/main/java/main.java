import java.util.Scanner;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class main {

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);

        final Logger LOG = LoggerFactory.getLogger(main.class);

        do {
            System.out.println("Bitte Temperatur eingeben (oder 'exit' zum Beenden): ");
            LOG.info("Getting input from user.");
            input = scanner.next();
            try{
                float value = Float.valueOf(input);
                System.out.println("Eingegebene Zahl: " + value);
            } catch (Exception e) {


                if(input.equals("exit")) {
                    break;
                }

                LOG.warn(e.getMessage());
                LOG.error("Bitte geben Sie eine Zahl eingeben.");
            }

        } while (!"exit".equals(input));
        LOG.info("Programm beendet.");
    }
}
