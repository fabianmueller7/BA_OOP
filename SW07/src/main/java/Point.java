public class Point {
    private int x = 0;
    private int y = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
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

    public void moveRelative(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public Point moveRelative(Point point, int x, int y) {
        point.x += x;
        point.y += y;
        return point;
    }

    public void moveRelative(double angle,int amount) {
        int offsetx = (int) (amount * Math.cos(angle));
        int offsety = (int) (amount * Math.sin(angle));
        this.x += offsetx;
        this.y += offsety;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
        if(obj == this) {
            return true;
        }
        return (obj instanceof Point p)
                && (p.getX() == this.x) && (p.getY() == this.y);
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public int compareTo(Point other) {
        return Long.compare(this.x, other.x) + Long.compare(this.y, other.y);
    }
}
