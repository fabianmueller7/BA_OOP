import java.util.*;
import java.time.LocalDate; 
/**
 * Write a description of class oven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class oven
{
    // instance variables - replace the example below with your own
    private int temperature;
    private LocalDate productiondate;
    private Status status;
    private boolean open;

    /**
     * Constructor for objects of class oven
     */
    public oven()
    {
        // initialise instance variables
        this.temperature = 0;
        this.status = Status.OFF;
        this.productiondate = LocalDate.now();
        this.open = false;
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setStatus(Status newstatus)
    {
         this.status = newstatus;
    }
    
    public void setOpen(boolean newopen)
    {
         this.open = newopen;
    }
    
    public Status getStatus()
    {
         return this.status;
    }
    
    public int getTemperature()
    {
         return this.temperature;
    }
    
        public boolean getOpen()
    {
         return this.open;
    }
}
