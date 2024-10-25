import java.awt.*;

public abstract class Shape implements Named{

    private int x;
    private int y;
    private String name;

    protected Shape(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void move(int newX, int newY){
        this.x += newX;
        this.y += newY;
    }

    public abstract int getPerimeter();

    public abstract int getArea();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
