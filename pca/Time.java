import java.util.Scanner;

public class Time {
    private int hour;
    private int minute;
    private int second;

    // Default constructor
    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    // Parameterized constructor
    public Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    // Method to add two Time objects
    public Time add(Time t2) {
        Time result = new Time();
        result.second = this.second + t2.second;
        result.minute = this.minute + t2.minute + result.second / 60;
        result.hour = this.hour + t2.hour + result.minute / 60;
        result.second %= 60;
        result.minute %= 60;

        return result;
    }

    // Method to display time
    public void display() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create three Time objects
        Time t1 = new Time(10, 25, 30);
        Time t2 = new Time(5, 40, 15);
        Time t3 = new Time();

        // Add t1 and t2, store result in t3
        System.out.println("Enter two time values to add:");
        System.out.print("Hour: ");
        int h = scanner.nextInt();
        System.out.print("Minute: ");
        int m = scanner.nextInt();
        System.out.print("Second: ");
        int s = scanner.nextInt();

        t1 = new Time(h, m, s);

        t3 = t1.add(t2);

        System.out.println("\nTime 1:");
        t1.display();
        System.out.println("\nTime 2:");
        t2.display();
        System.out.println("\nSum of Time 1 and Time 2:");
        t3.display();

        scanner.close();
    }
}