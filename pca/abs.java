import java.util.Scanner;

abstract class Shape {
    abstract double area();
    abstract void disp();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    void disp() {
        System.out.println("Rectangle area: " + area());
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    void disp() {
        System.out.println("Circle area: " + area());
    }
}

class Triangle extends Shape {
    private double side1, side2, side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double area() {
        // Using Heron's formula
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    void disp() {
        System.out.println("Triangle area: " + area());
    }
}

public class abs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rectangle length and width: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Shape rectangle = new Rectangle(length, width);

        System.out.print("Enter circle radius: ");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);

        System.out.print("Enter triangle sides: ");
        double s1 = scanner.nextDouble();
        double s2 = scanner.nextDouble();
        double s3 = scanner.nextDouble();
        Shape triangle = new Triangle(s1, s2, s3);

        System.out.println("\nAreas of shapes:");
        rectangle.disp();
        circle.disp();
        triangle.disp();

        scanner.close();
    }
}
