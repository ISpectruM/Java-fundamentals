package G_OpenClosed_Liskov_Lab.P03_GraphicEditor;

public class Main {
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        Shape circle = new Circle();
        editor.drawShape(circle);
    }
}
