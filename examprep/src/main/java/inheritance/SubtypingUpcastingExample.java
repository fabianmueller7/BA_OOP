package inheritance;

public class SubtypingUpcastingExample {

    Vehicle vehicle;

    SubtypingUpcastingExample(Car car) {
        this.vehicle = (Vehicle) car; //Upcasting
    }

    public Car getCar() {
        return (Car) vehicle; //Downcasting
    }
}
