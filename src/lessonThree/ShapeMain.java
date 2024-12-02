package lessonThree;

import java.util.Locale;
import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean loopContinue = true;

        while (loopContinue) {
            System.out.println("Enter C for Circle");
            System.out.println("Enter R for Rectangle");
            System.out.println("Enter T for Triangle");

            char choice = scan.next().toUpperCase().charAt(0);

            switch (choice) {
                case 'C':

                    System.out.println("Enter the radius of the circle");
                    double radius = scan.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.printf("The area of the Circle is: %.2f\n", circle.computeArea());
                    break;


                case 'R':
                    System.out.println("Enter the width of the rectangle");
                    double width = scan.nextDouble();
                    System.out.println("Enter the length of the rectangle");
                    double length = scan.nextDouble();
                    Rectangle rectangle = new Rectangle(width, length);
                    System.out.printf("The area of the Rectangle is: %.2f\n", rectangle.computeArea());
                    break;


                case 'T':

                    System.out.println("Enter the base of the triangle");
                    double base = scan.nextDouble();
                    System.out.println("Enter the height of the triangle");
                    double height = scan.nextDouble();
                    Triangle triangle = new Triangle(base,height);
                    System.out.printf("The area of the Rectangle is: %.2f\n", triangle.computeArea());
                    break;


                default:
                    System.out.println("Invalid Choice Please Try Again");
                    break;
            }

            System.out.println("do you want to continue ? [y/n]");
            char continueChoice = scan.next().toLowerCase().charAt(0);
            loopContinue=(continueChoice=='y');


        }
        scan.close();
    }
}
