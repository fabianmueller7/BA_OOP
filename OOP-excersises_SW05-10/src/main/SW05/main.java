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

    }
}
