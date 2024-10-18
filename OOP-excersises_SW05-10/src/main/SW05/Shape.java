import java.awt.*;

public abstract class Shape {

    private int x;
    private int y;

    protected Shape(int x, int y){
        this.x = x;
        this.y = y;
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
}
