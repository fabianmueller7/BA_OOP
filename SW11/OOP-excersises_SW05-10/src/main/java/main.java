import java.util.Scanner;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class main {

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);

        String csvpath = "/Users/muellefa/repos/BA_OOP/SW11/OOP-excersises_SW05-10/src/main/java/TemperaturSave.csv";
        TempCSVHandler tempCSVHandler = new TempCSVHandler();
        TemperaturVerlauf temperaturVerlauf = tempCSVHandler.loadCSVFile(csvpath, 3);

        final Logger LOG = LoggerFactory.getLogger(main.class);
        User listener = new User("listener1");
        temperaturVerlauf.addPropertyChangeListener(listener);

        do {
            System.out.println("Bitte Temperatur eingeben (oder 'exit' zum Beenden): ");
            input = scanner.next();
            try{
                float value = Float.valueOf(input);
                temperaturVerlauf.add(Messpunkt.neuerMesspunkt(Temperatur.createFromCelsius(value)));
            } catch (Exception e) {

                if(input.equals("exit")) {
                    break;
                }

                LOG.warn(e.getMessage());
                LOG.error("Bitte geben Sie eine Zahl eingeben.");
            }

        } while (true);

        tempCSVHandler.StoreToCsv(temperaturVerlauf.getMesspunkte(),"/Users/muellefa/repos/BA_OOP/SW11/OOP-excersises_SW05-10/src/main/java/TemperaturSave2.csv");

        LOG.info("Einträge: " + temperaturVerlauf.getCount());
        LOG.info("\n"+ temperaturVerlauf.toString());
        LOG.info("Programm beendet.");
    }
}