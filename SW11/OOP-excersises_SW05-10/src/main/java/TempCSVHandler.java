import java.io.*;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

public class TempCSVHandler {

    private TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("\"yyyy/MM/dd HH:mm:ss\"");

    TempCSVHandler(){

    }

    public TemperaturVerlauf loadCSVFile(final String file, final int numberOfColumns){
        String stringBuffer = this.readTextFileBuffer(file);
        String[]  datesString = this.splitCSV(stringBuffer, numberOfColumns, 1);
        LocalDateTime[] dates = this.convertDateTimeColumn(datesString);
        String[]  temps = this.splitCSV(stringBuffer, numberOfColumns, 2);

        for(int i = 0; i<temps.length; i++) {
            temperaturVerlauf.add(Temperatur.createFromCelsius(Float.valueOf(temps[i]), dates[i]));
        }
        return temperaturVerlauf;
    }

    public void StoreToCsv(final Collection<Temperatur> temps, final String file) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));

            temps.forEach(temperatur -> {
                try {
                    dos.writeUTF(temperatur.getDate().format(formatter) + ";"+ temperatur.getCelsius() + "\n");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            });
        } catch (IOException ioe) {
            System.err.println("An error occurred while writing text file: " + ioe);
        }
    }

    private String readTextFileBuffer(final String file) {
        if (new File(file).exists()) {
            try (BufferedReader br =
                         new BufferedReader(new InputStreamReader(
                                 new FileInputStream(file), Charset.forName("UTF-8")))
            ) {
                String line;
                String fileString = "";
                while ((line = br.readLine()) != null) {
                    //System.out.println(line);
                    fileString += line;
                }
                return fileString;
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage() + "\n"  +  ioe);
            }
        }
        return "";
    }

    private String[] splitCSV(String csv, int lengthOfElement,  int column) {

        String[] values = csv.split(";");

        int numberOfElements = values.length/lengthOfElement;

        String[] temps = new String[numberOfElements];


        for (int i = 0; i < numberOfElements; i++) {
            temps[i] = values[(i * lengthOfElement) + column];
        }
        return  temps;
    }

    private LocalDateTime[] convertDateTimeColumn(String[] dates) {
        LocalDateTime[] temp = new LocalDateTime[dates.length];
        for (int i = 0; i < dates.length; i++) {
            LocalDateTime timestamp  = LocalDateTime.parse(dates[i], DateTimeFormatter.ofPattern("\"yyyy/MM/dd HH:mm:ss\""));
            temp[i] = timestamp;
        }
        return temp;
    }
}
