// EIE3320 Lab1
// Modified by WU Bokun 22099459D, WANG Kaiyuan 22101552D

public class PictureTester {
    public static void main(String[] args) {
        Picture p = new Picture();
        p.addShape(new Square(2.0));
        p.addShape(new Square(2));
        p.addShape(new Circle(3.0));
        p.addShape(new Circle(4));
        p.addShape(new Rectangle(5.0, 6.0));
        p.addShape(new Rectangle(7, 8));
        p.computeShape();
        p.listAllShapeTypes();
        p.listSingleShapeType("Circle");
    }
}
