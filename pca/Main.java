import java.util.Scanner;

class Shape {
    double area;

    // Constructor for Circle
    Shape(double radius) {
        area = Math.PI * radius * radius;
    }

    // Constructor for Triangle
    Shape(double side1, double side2,double side3) {
        double s=side1+side2+side3/2;
        area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    // Constructor for Rectangle
    Shape(double length, double width) {
        area = length * width;
    }

    void displayArea() {
        System.out.println("Area: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Circle object
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Shape circle = new Shape(radius);

        // Create a Triangle object
        System.out.print("enter the sides of the triangle: ");
        double s1 = scanner.nextDouble();
        double s2 = scanner.nextDouble();
        double s3 = scanner.nextDouble();
        Shape triangle = new Shape(s1,s2,s3);

        // Create a Rectangle object
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        Shape rectangle = new Shape(length, width);

        // Display the areas
        circle.displayArea();
        triangle.displayArea();
        rectangle.displayArea();

        scanner.close();
    }
}