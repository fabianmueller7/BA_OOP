import java.beans.PropertyChangeEvent;

public class User implements PropertyChangeListener {

    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(  this.getName() + ": " + evt.getPropertyName() + ": " + evt.getNewValue());
    }
}
