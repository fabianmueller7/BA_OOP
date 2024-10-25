public class main {
    public static void main(String[] args) {

        System.out.println("Starting main...");

        System.out.println("Point:");
        Point p = new Point(7, 8);
        System.out.println("X: " + p.getX() + "; Y: " + p.getY());
        System.out.println("Quadrant: " + p.getQuadrant());
        p.moveRelative(123d, 10);
        System.out.println("X: " + p.getX() + "; Y: " + p.getY());

        Shape shape1 = new Rectangle(0,0,"Rectangle", 5,10);
        Shape shape2 = new Circle(0,5,"Circle", 5);
        shape2.move(1,2);
        shape1.move(1,2);
        Circle circle = (Circle) shape2;
        System.out.println("Circle diameter: " +  circle.getDiameter());

        Mercury mercury = new Mercury();
        System.out.println(mercury.toString());
    }
}
