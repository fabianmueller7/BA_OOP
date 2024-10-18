import java.awt.*;

public class Square extends Shape {

    private int side;

    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    public int getSide() {
        return this.side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea(){
        return (int)Math.pow(this.side,2);
    }

    @Override
    public int getPerimeter(){
        return 4*this.side;
    }
}
