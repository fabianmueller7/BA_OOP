public class Point {
    private int x = 0;
    private int y = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getQuadrant() {
        //  1/2
        //  ---
        //  3/4
        if (this.x < 0 && this.y < 0) {
            return 3;
        }

        if (this.x < 0 && this.y > 0) {
            return 1;
        }

        if (this.x > 0 && this.y < 0) {
            return 4;
        }

        if (this.x > 0 && this.y > 0) {
            return 2;
        }

        return 0;
    }

}
