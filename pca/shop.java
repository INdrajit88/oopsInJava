import java.util.Scanner;

class Media {
    protected String title;
    protected String publication;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter title: ");
        title = scanner.nextLine();
        System.out.print("Enter publication: ");
        publication = scanner.nextLine();
    }

    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Publication: " + publication);
    }
}

class Book extends Media {
    private int numPages;

    @Override
    public void read() {
        super.read();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of pages: ");
        numPages = scanner.nextInt();
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Number of pages: " + numPages);
    }
}

class Tape extends Media {
    private double playingTime; // in minutes

    @Override
    public void read() {
        super.read();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter playing time (in minutes): ");
        playingTime = scanner.nextDouble();
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Playing time: " + playingTime + " minutes");
    }
}

public class shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Book\n2. Add Tape\n3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Book book = new Book();
                    book.read();
                    System.out.println("\nBook Details:");
                    book.show();
                    break;
                case 2:
                    Tape tape = new Tape();
                    tape.read();
                    System.out.println("\nTape Details:");
                    tape.show();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);

        scanner.close();
    }
}
