import java.util.Date;
import java.time.LocalDate; 

/**
 * Write a description of class Fahrrad here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fahrrad
{
    

    // instance variables - replace the example below with your own
    private Sizes Size;
    private LocalDate Productiondate;
    private String Color;
    
    /**
     * Constructor for objects of class Fahrrad
     */
    public Fahrrad(Sizes size, String Color)
    {
        // initialise instance variables
        this.Size = size;
        this.Productiondate = LocalDate.now();
        this.Color = Color;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getColor()
    {
        // put your code here
        return this.Color;
    }
    
        public LocalDate getProductiondate()
    {
        // put your code here
        return this.Productiondate;
    }
}
