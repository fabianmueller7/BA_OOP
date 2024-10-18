public class main {

    public static void main(String[] args) {

        System.out.println("SW05...");

        Car carobj = new Car(10);
        carobj.switchOn();
        System.out.println("Car runnning?: " + carobj.isSwitchedOn());

        TemperaturSW04 tempobj = new TemperaturSW04(23);
        System.out.println("TempF: " + tempobj.getUmgTempInFahrenheit());
        System.out.println("TempK: " + tempobj.getUmgTempInKelvin());
        System.out.println("TempC: " + tempobj.getUmgTempInCelsius());

        Engine engineobj = new Engine();
        engineobj.setRpm(2500);
        System.out.println("Rpm: " + engineobj.getRpm());

    }
}
