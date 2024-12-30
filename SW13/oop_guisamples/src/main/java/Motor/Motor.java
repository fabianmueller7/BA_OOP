package Motor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Motor {
    private int speed;


    private static final Logger LOG = LoggerFactory.getLogger(Motor.class);

    public Motor() {
        speed = 0;
        Manufacturer = "Standard";
        status = false;
    }

    public Motor(int speed, String Manufacturer) {
        this.speed = speed;
        this.Manufacturer = Manufacturer;
        status = false;
    }

    public void setSpeed(int speed) {
        LOG.info("RPM set to: " + speed);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}