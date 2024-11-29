import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class User implements PropertyChangeListener {

    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void propertyChangeMax(PropertyChangeEvent evt) {
        System.out.println(evt.getPropertyName() + ": " + evt.getNewValue());
    }

    public void propertyChangeMin(PropertyChangeEvent evt) {
        System.out.println(evt.getPropertyName() + ": " + evt.getNewValue());
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals("Max")) {
            this.propertyChangeMax(evt);
        } else {
            this.propertyChangeMin(evt);
        }
    }
}