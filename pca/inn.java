class OuterClass {
    class InnerClass {
        private int x;

        // Constructor that takes an argument
        public InnerClass(int x) {
            this.x = x;
        }
    }
}

class OuterClass2 {
    class InnerClass2 extends OuterClass.InnerClass {
        public InnerClass2(int x) {
            super(x); // Call the superclass constructor
        }
    }
}
public class inn {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass(10);

        OuterClass2 outer2 = new OuterClass2();
        OuterClass2.InnerClass2 inner2 = outer2.new InnerClass2(20);
    }
}