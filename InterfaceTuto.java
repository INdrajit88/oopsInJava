/**
 * InterfaceTuto
 */
interface Animal{
    //interface is a collection of abstract methods
    //interface doesnot have any constructor
    //interface can have variables but they are by default public static final
    //interface can have methods but they are by default public and abstract
    void walk();//cant use private or protected
    void eat();//cant implement methods of interface in abstract class
}
interface Herbivore{
    void eatGrass();
}
class Horse implements Animal,Herbivore{
    //if we are implementing an interface, we need to implement all the methods of the interface
    public void walk(){
        System.out.println("I am walking on 4 legs");
    }
    public void eat(){
        System.out.println("I am eating grass");
    }
    public void eatGrass(){
        System.out.println("I am eating grass");
    }
}
public class InterfaceTuto {

    
}