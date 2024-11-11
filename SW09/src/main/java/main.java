import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temperatur eingeben (oder 'exit' zum Beenden): ");
            input = scanner.next();
            try{
                float value = Float.valueOf(input);
                System.out.println("Eingegebene Zahl: " + value);
            } catch (Exception e) {

                if(input.equals("exit")) {
                    break;
                }

                System.out.println("Bitte geben Sie eine Zahl eingeben.");
                System.out.println(e.getMessage());
            }

        } while (!"exit".equals(input));
        System.out.println("Programm beendet.");
    }
}
