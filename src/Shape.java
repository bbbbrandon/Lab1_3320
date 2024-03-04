// EIE3320 Lab1
// Modified by WU Bokun 22099459D, WANG Kaiyuan 22101552D

abstract class Shape implements Drawable {
    protected double area;
    protected double perimeter;

    // To read the shape information from users
    abstract public void readShape();

    // To compute the shape’s area
    abstract public void computeArea();

    // To computer the shape’s perimeter
    abstract public void computePerimeter();

    // To display the area and perimeter of the shape
    abstract public void displayShape();

    // To draw the shape on canvas
    abstract public void draw();
}
