package staticAndConstants;

public class Example {

    private final static int COUNTER = 5;

    public static Example getInstance () {
        return new Example();
    }
}
