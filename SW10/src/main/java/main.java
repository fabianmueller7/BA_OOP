public class main {

    public static void main(String[] args) {

        Car car1 = new Car("Car1",0);
        Car car2 = new Car("Car2",0);
        Car car3 = new Car("Car3",0);
        Engine engine = new Engine();
        engine.addPropertyChangeListener(car1);
        engine.addPropertyChangeListener(car2);
        engine.addPropertyChangeListener(car3);
        engine.switchOn();
    }
}
