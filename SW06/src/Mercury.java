public class Mercury extends Element {

    public Mercury() {
        super("Mercury", -38, 356);
    }

    public String toString() {
        String stringObj = super.toString();
        stringObj += "Giftig! \n";
        return stringObj;
    }
}
