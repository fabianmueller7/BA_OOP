package loops;

import java.util.ArrayList;
import java.util.List;

public class Loops {

    Loops(){}

    public String switchCase(String input) {
        String output = switch (input) {
            case "rot" -> "ROT";
            case "grün" -> "GRÜN";
            case "blau" -> "BLAU";
            default -> "unbekannt";
        };
        return output;
    }

    public void ContinueBreak(int input) {
        while (input != 0) {
            if (input % 2 == 0) {
                continue; //Jumps to checking the statement again.
            }
            if (input % 3 == 0) {
                break; //Terminats loop
            }
        }
    }

    public List<String> Foreach(final List<String> input) {

        List<String> output = new ArrayList<>();
        for(final String s : input) {
            output.add(s.toUpperCase());
        }
        return output;
    }
}
