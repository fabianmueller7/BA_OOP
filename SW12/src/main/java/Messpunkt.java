import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Messpunkt {

    private LocalDateTime date;
    private Temperatur temperatur;

    public static Messpunkt neuerMesspunkt(Temperatur temperatur) {
        return new Messpunkt(LocalDateTime.now(), temperatur);
    }

    public Messpunkt(LocalDateTime date, Temperatur temperatur) {
        this.date = date;
        this.temperatur = temperatur;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Temperatur getTemperatur() {
        return temperatur;
    }

    public float getCelsius() {
        return temperatur.getCelsius();
    }
}