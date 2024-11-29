import java.io.*;
import java.nio.charset.Charset;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Filehandler {

    Filehandler() {

    }

    final Logger LOG = LoggerFactory.getLogger(main.class);

    public void writeTextFileUTF(final String file, final String value) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
            dos.writeUTF(value);
        } catch (IOException ioe) {
            LOG.error("Datei nicht schreibbar.");
            System.err.println("An error occurred while writing text file: " + ioe);
        }
    }

    public String readTextFileUTF(final String file) {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(file));
            String value  = "";
            value += String.valueOf(dis.readUTF()) + " ";

            return value;
        } catch (IOException ioe) {
            LOG.error("Datei nicht lesbar.", ioe);
            return "";
        }
    }

    public void writeTextFileFloat(final String file, final  TemperaturVerlauf temperaturVerlauf) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
            dos.writeInt(temperaturVerlauf.getCount());

            temperaturVerlauf.getTemperaturen().forEach(temperatur -> {
                try {
                    dos.writeFloat(temperatur.getCelsius());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

        } catch (IOException ioe) {
            LOG.error("Datei nicht schreibbar.");
            System.err.println("An error occurred while writing text file: " + ioe);
        }
    }

    public String readTextFileFloat(final String file) {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(file));
            int numberOfTemps = dis.readInt();
            String value  = "";

            for (int i = 0; i < numberOfTemps; i++) {
                value += String.valueOf(dis.readFloat()) + " ";
            }
            return value;
        } catch (IOException ioe) {
            LOG.error("Datei nicht lesbar.", ioe);
            return "";
        }
    }

    public Logger getLOG() {
        return LOG;
    }
}
