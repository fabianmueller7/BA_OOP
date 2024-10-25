import java.awt.*;

public class Line {

    private Point p1 = new Point();
    private Point p2 = new Point();

    Line(int x1,int y1 ,int x2 ,int y2){
        this.p1.x = x1;
        this.p1.y = y1;
        this.p2.x = x2;
        this.p2.y = y2;
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