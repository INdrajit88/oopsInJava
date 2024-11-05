interface Drawable {
    void draw();
}

interface Colorable {
    void color();
}

interface Displayable extends Drawable, Colorable {
    void display();
}

class Shape {
    protected String name;
    
    Shape(String name) {
        this.name = name;
    }
}

class Circle extends Shape implements Displayable {
    Circle() {
        super("Circle");
    }
    
    public void draw() {
        System.out.println("Drawing " + name);
    }
    
    public void color() {
        System.out.println("Coloring " + name);
    }
    
    public void display() {
        System.out.println("Displaying " + name);
    }
}

class InterfaceDemo {
    static void testDrawable(Drawable d) {
        d.draw();
    }
    
    static void testColorable(Colorable c) {
        c.color();
    }
    
    static void testDisplayable(Displayable d) {
        d.display();
    }
    
    public static void main(String[] args) {
        Circle circle = new Circle();
        
        testDrawable(circle);
        testColorable(circle);
        testDisplayable(circle);
    }
}
