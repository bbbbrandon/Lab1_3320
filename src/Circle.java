// EIE3320 Lab1
// Modified by WU Bokun 22099459D, WANG Kaiyuan 22101552D

import java.awt.geom.Ellipse2D;
import java.util.Scanner;

class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public void readShape() {
        System.out.println("Please Input Radius:");
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextInt();
    }

    public void computeArea() {
        area = Math.PI * radius * radius;
    }

    public void computePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    public void displayShape() {
        String fareac = String.format("%.6f", area);
        String fperimeterc = String.format("%.6f", perimeter);
        System.out.println("Area of circle = " + fareac);
        System.out.println("Perimeter of circle = " + fperimeterc);
        draw();
    }
    
    // Implementation of abstract method draw
    public void draw() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "blue", new Ellipse2D.Double(50, 50, radius, radius));
    }
}
