public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int x, int y, String name, int width, int height) {
        super(x, y, name);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea(){
        return width * height;
    }

    @Override
    public int getPerimeter(){
        return 2*width+2*height;
    }
}
