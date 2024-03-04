// EIE3320 Lab1
// Modified by WU Bokun 22099459D, WANG Kaiyuan 22101552D

import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            for (int i = 0; i < 37; i++) {
                System.out.print('*');
            }
            System.out.println('*');
            System.out.println("* Please choose one the followings:  *");
            System.out.println("* Press 'c' - Circle                 *");
            System.out.println("* Press 's' - Square                 *");
            System.out.println("* Press 'r' - Rectangle              *");
            System.out.println("* Press 'x' - EXIT                   *");
            for (int j = 0; j < 37; j++) {
                System.out.print('*');
            }
            System.out.println('*');


            Scanner scanner = new Scanner(System.in);
            String inputs = scanner.next();
            char input = inputs.charAt(0);

            Shape shape;
            if (input == 'x') {
                break;
            } else if (input == 'c') {
                shape = new Circle(0);
            } else if (input == 's') {
                shape = new Square(0);
            } else if (input == 'r') {
                shape = new Rectangle(0, 0);
            } else {
                System.out.println("Invalid Command!");
                continue;
            }

            shape.readShape();
            shape.computeArea();
            shape.computePerimeter();
            shape.displayShape();
            shape.draw();
        }
    }
}
