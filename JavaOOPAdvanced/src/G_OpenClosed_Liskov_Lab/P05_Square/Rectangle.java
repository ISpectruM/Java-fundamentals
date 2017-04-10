package G_OpenClosed_Liskov_Lab.P05_Square;

public class Rectangle {
    private int width;
    private  int height;

    public Rectangle() {
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.getHeight();
    }

    public int getArea() {
        return this.width*this.getHeight();
    }
}
