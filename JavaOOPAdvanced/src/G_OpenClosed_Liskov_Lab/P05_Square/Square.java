package G_OpenClosed_Liskov_Lab.P05_Square;

public class Square extends Rectangle {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getWidth() {
        return this.side;
    }

    public int getHeight(){
        return this.side;
    }

    @Override
    public int getArea() {
        return this.side*this.side;
    }
}
