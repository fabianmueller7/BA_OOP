public class main {

    public static void main(String[] args) {

        System.out.println("SW05...");

        Rectangle rectangleObj = new Rectangle(0,0,5,10);
        System.out.println("Rectangle Area: " + rectangleObj.getArea());
        System.out.println("Rectangle Perimeter: " + rectangleObj.getPerimeter());

        Square squareObj = new Square(0,0,10);
        System.out.println("Square Area: " + squareObj.getArea());
        System.out.println("Square Perimeter: " + squareObj.getPerimeter());

        Circile circileObj = new Circile(0,0,10);
        System.out.println("Circle Area: " + circileObj.getArea());
        System.out.println("Circle Perimeter: " + circileObj.getPerimeter());

    }
}
