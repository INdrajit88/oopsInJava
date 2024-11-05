interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

interface Interface3 extends Interface1, Interface2 {
    void method3();
}

class BaseClass {
    // ...
}

class MyClass extends BaseClass implements Interface3 {
    @Override
    public void method1() {
        System.out.println("Method 1 implemented");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 implemented");
    }

    @Override
    public void method3() {
        System.out.println("Method 3 implemented");
    }
}

public class Main {
    public static void methodA(Interface1 obj) {
        obj.method1();
    }

    public static void methodB(Interface2 obj) {
        obj.method2();
    }

    public static void methodC(Interface3 obj) {
        obj.method1();
        obj.method2();
        obj.method3();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        methodA(obj);
        methodB(obj);
        methodC(obj);
    }
}