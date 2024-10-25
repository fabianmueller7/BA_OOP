public class main {

    public static void main(String[] args) {

        Car carObj  = new Car(100);
        carObj.setSpeed(50);
        System.out.println("The car is " + carObj.getTank() + " full, and driving at " + carObj.getSpeed() + " km/h");

        Engine engineObj = new Engine();
        engineObj.switchOn();
        engineObj.setRpm(1800);
        System.out.println("RPM: " + engineObj.getRpm());

        Line lineObj = new Line(3,7,8,10);
        System.out.println("P1: x " + lineObj.getP1().getX() + " y " + lineObj.getP1().getY());
        System.out.println("P2: x " + lineObj.getP2().getX() + " y " + lineObj.getP2().getY());
    }
}
