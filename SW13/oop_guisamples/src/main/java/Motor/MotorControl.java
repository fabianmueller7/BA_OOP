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

public class MotorControl implements ActionListener {

    Motor motor = null;
    MotorView view = null;

    private static final Logger LOG = LoggerFactory.getLogger(MotorControl.class);

    public MotorControl() {
        LOG.info("MotorControl erstellt");
        this.motor = new Motor(10, "Mercedes");

        this.view = new MotorView(this::changeRpm);

    }


    public void actionPerformed(final ActionEvent e) {
        this.motor.setSpeed(rpm);
    }

    public static void main(String[] args) {
        MotorControl motorControl = new MotorControl();

    }
}