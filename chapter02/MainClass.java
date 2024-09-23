import java.util.*;

public class MainClass {
    public static void main(String[] args){
        System.out.println("Start des Programmes");

        Temperatur obj1Temperatur = new Temperatur(20);
        System.out.println("Celsius: " + obj1Temperatur.getUmgebungstemperaturInCelsius());
        System.out.println("Kelvin: " + obj1Temperatur.getUmgebungstemperaturInKelvin());
        System.out.println("Fahrenheit: " + obj1Temperatur.getUmgebungstemperaturInFahrenheit());


    }
}
