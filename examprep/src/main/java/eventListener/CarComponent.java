package eventListener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CarComponent implements PropertyChangeListener {

    private String component;
    private String manufacturer;
    private int productionYear;
    private float price;

    CarComponent(String component, String manufacturer, int productionYear, float price) {
        this.component = component;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.price = price;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("CarComponent propertyChange: " + evt.getPropertyName());
    }
}
