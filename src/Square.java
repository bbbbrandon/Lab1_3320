// EIE3320 Lab1
// Modified by WU Bokun 22099459D, WANG Kaiyuan 22101552D

import java.util.Scanner;

public class Square extends Shape {
    private double side;

    public Square(double s) {
        this.side = s;
    }

    public void readShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Input Side:");
        side = scanner.nextInt();
    }

    public void computeArea() {
        area = side * side;
    }

    public void computePerimeter() {
        perimeter = 4 * side;
    }

    public void displayShape() {
        String fareas = String.format("%.6f", area);
        String fperimeters = String.format("%.6f", perimeter);
        System.out.println("Area of square = " + fareas);
        System.out.println("Perimeter of square = " + fperimeters);
        draw();
    }

    // Implementation of abstract method draw
    public void draw() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "blue", new java.awt.Rectangle(300, 100, (int) side, (int) side));
    }
}
