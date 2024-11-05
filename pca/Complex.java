import java.util.Scanner;

class Complex {
    int real;
    int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex multiply(Complex c) {
        int realPart = this.real * c.real - this.imaginary * c.imaginary;
        int imaginaryPart = this.real * c.imaginary + this.imaginary * c.real;
        return new Complex(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter real and imaginary parts of first complex number: ");
        Complex c1 = new Complex(scanner.nextInt(), scanner.nextInt());
        System.out.print("Enter real and imaginary parts of second complex number: ");
        Complex c2 = new Complex(scanner.nextInt(), scanner.nextInt());

        Complex result = c1.multiply(c2);
        System.out.println("Multiplication result: " + result);
    }
}