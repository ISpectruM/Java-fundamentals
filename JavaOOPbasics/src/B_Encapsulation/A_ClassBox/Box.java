package B_Encapsulation.A_ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getSurfaceArea(){
        return (2*length*width + 2*width*height + 2*length*height);
    }

    public double getLateralArea(){
        return (2*length*height + 2*width*height);
    }

    public double getVolume(){
        return length*width*height;
    }
}
