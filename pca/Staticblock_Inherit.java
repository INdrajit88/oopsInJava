class Parent {
    static {
        System.out.println("Parent's static block executed");
    }
    
    Parent() {
        System.out.println("Parent's constructor executed");
    }
}

class Child extends Parent {
    static {
        System.out.println("Child's static block executed"); 
    }
    
    Child() {
        System.out.println("Child's constructor executed");
    }
}

public class Staticblock_Inherit {
    public static void main(String[] args) {
        System.out.println("Main method execution starts");
        Child obj = new Child();
    }
}
