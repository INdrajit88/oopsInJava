abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("You are creating a new animal");
    }
    void eat(){
        System.out.println("I am eating");
    }

}
class Horse extends Animal{
    Horse(){
        System.out.println("You are creating a new horse");
    }
    void walk(){
        System.out.println("I am walking on 4 legs");
    }
    void eat(){
        System.out.println("I am eating grass");
    }
}
class Cat extends Animal{
    void walk(){
        System.out.println("I am walking on 4 legs");
    }
    void eat(){
        System.out.println("I am eating fish");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.eat();
        Cat cat1 = new Cat();
        cat1.eat();
        // Animal animal = new Animal();
        // animal.eat(); //this will give run time error because we cannot create an object of an abstract class
    }
}
