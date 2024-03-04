// EIE3320 Lab1
// Modified by WU Bokun 22099459D, WANG Kaiyuan 22101552D

import java.util.Scanner;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public void readShape() {
        System.out.println("Please Input Length:");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        System.out.println("Please Input Width:");
        width = scanner.nextInt();
    }

    public void computeArea() {
        area = length * width;
    }

    public void computePerimeter() {
        perimeter = (length + width) * 2;
    }

    public void displayShape() {
        String farear = String.format("%.6f", area);
        String fperimeterr = String.format("%.6f", perimeter);
        System.out.println("Area of rectangle = " + farear);
        System.out.println("Perimeter of rectangle = " + fperimeterr);
        draw();
    }


    // Implementation of abstract method draw
     public void draw() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "blue", new java.awt.Rectangle(200, 200, (int) length, (int) width));
    }
}

