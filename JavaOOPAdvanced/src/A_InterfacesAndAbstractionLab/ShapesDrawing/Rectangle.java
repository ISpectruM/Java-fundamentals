package InterfacesAndAbstractionLab.ShapesDrawing;

public class Rectangle implements Drawable{
    private int width;
    private int height;

    public Rectangle( int width, int height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public int getWidth() {
        return this.width;
    }

    private void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    private void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        for (int i = 0; i < this.getHeight(); i++) {
            System.out.print("*");
            for (int j = 1; j < this.getWidth()-1; j++) {
                System.out.print(" ");
                if (i == 0 || i == this.getHeight()-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            System.out.print("*");
            System.out.println();
        }
    }
}
