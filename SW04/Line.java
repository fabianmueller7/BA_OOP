import java.awt.*;

public class Line {

    private Point p1;
    private Point p2;

    Line(x1,y1,x2,y1){
        p1.x = x1;
        p1.y = y1;
        p2.x = x2;
        p2.y = y2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP1(Point point) {
        this.p1 = point;
    }

    public void setP2(Point point) {
        this.p2 = point;
    }
}