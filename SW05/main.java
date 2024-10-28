public class main {

    public static void main(String[] args) {

        System.out.println("SW05...");

        Rectangle rectangleObj = new Rectangle(0,0, "Rectangle",5,10);
        System.out.println(rectangleObj.getName());
        System.out.println("Area: " + rectangleObj.getArea());
        System.out.println("Perimeter: " + rectangleObj.getPerimeter());

        Square squareObj = new Square(0,0,"Square" ,10);
        System.out.println(squareObj.getName());
        System.out.println("Area: " + squareObj.getArea());
        System.out.println("Perimeter: " + squareObj.getPerimeter());

        Circile circileObj = new Circile(0,0, "Circle",10);
        System.out.println(circileObj.getName());
        System.out.println("Area: " + circileObj.getArea());
        System.out.println("Perimeter: " + circileObj.getPerimeter());

        CountingSwitchable countingSwitchableObj = new CountingSwitchable();
        countingSwitchableObj.switchOn();
        countingSwitchableObj.switchOff();
        countingSwitchableObj.switchOn();
        System.out.println("SwitchCounter: " + countingSwitchableObj.getSwitchCounter());

        TemperaturSW05 tempObj = new TemperaturSW05(20);
        Element elementObj = new Element("Water", 0,100);
        System.out.println(elementObj.getName());
        System.out.println("Current state 20C:" + tempObj.getAggregatszustand(elementObj).toString());
        tempObj.setUmgTempInCelsius(110);
        System.out.println("Current state 110C:" + tempObj.getAggregatszustand(elementObj).toString());
        tempObj.setUmgTempInCelsius(-10);
        System.out.println("Current state -10C:" + tempObj.getAggregatszustand(elementObj).toString());

    }
}
