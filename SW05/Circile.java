import java.awt.*;

public class Circile extends Shape{
    private int diameter;

    public Circile(int x, int y,String name , int diameter){
        super(x, y, name);
        this.diameter = diameter;
    }

    public int getDiameter(){
        return diameter;
    }

    public void setDiameter(int diameter){
        this.diameter = diameter;
    }

    @Override
    public int getArea(){
        return (int)((Math.PI/4)*Math.pow(this.diameter,2));
    }

    @Override
    public int getPerimeter(){
        return (int)((Math.PI)*this.diameter);
    }
}
