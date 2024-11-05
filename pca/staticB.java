class Demo {
    static int count = 0;
    int num;

    static {
        System.out.println("Static block executed");
        count = 10;
    }

    Demo() {
        num = 5;
        count++;
        System.out.println("Constructor executed");
        System.out.println("Count is: " + count);
    }
}

public class staticB {
    public static void main(String[] args) {
        System.out.println("Main method execution starts");
        System.out.println("Creating first object");
        Demo obj1 = new Demo();
        
        System.out.println("\nCreating second object");
        Demo obj2 = new Demo();
    }
}
