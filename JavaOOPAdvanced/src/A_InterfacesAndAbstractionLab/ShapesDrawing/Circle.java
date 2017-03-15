package InterfacesAndAbstractionLab.ShapesDrawing;

public class Circle implements Drawable{
    private int radius;
    private int pointX;
    private int pointY;

    public Circle(int radius, int pointX, int pointY) {
        this.setPointX(pointX);
        this.setPointY(pointY);
        this.setRadius(radius);
    }

    public int getRadius() {
        return this.radius;
    }

    private void setRadius(int radius) {
        this.radius = radius;
    }

    public int getPointX() {
        return this.pointX;
    }

    private void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public int getPointY() {
        return this.pointY;
    }

    private void setPointY(int pointY) {
        this.pointY = pointY;
    }

    @Override
    public void draw() {
        double r_in = this.getRadius() - 0.4;
        double r_out = this.getRadius() + 0.4;

        for (double y = this.getRadius(); y >=-this.getRadius() ; --y) {

            for (double x = - this.getRadius(); x < r_out ; x+= 0.5) {

                double value = x*x + y*y;
                if (value >= r_in*r_in && value <= r_out*r_out){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
