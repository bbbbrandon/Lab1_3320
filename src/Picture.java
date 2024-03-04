import java.util.ArrayList;

// EIE3320 Lab1
// Modified by WU Bokun 22099459D, WANG Kaiyuan 22101552D

public class Picture {
    private ArrayList<Shape> shapes;

    public Picture() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public void computeShape() {
        for (Shape shape : shapes) {
            shape.computeArea();
            shape.computePerimeter();
        }
    }

    public void listAllShapeTypes() {
        for (Shape shape : shapes) {
            shape.displayShape();
        }
    }

    public void listSingleShapeType(String className) {
        for (Shape shape : shapes) {
            if (shape.getClass().getSimpleName().equals(className)) {
                shape.displayShape();
            }
        }
    }
}
