class Pen{
    String color;
    String type; //ballpoint, gel

    //function
    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //default constructor which is called when the object is created
    Student(){
        System.out.println("Constructor called");
    }
    //parameterized constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    //copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class oops{
    public static void main(String[] args){
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";
        // pen1.write();
        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ballpoint";
        // pen1.printColor();
        // pen2.printColor();
        //for default constructor
        Student s1 = new Student();
        //new keyword is used to create a new object where memory is allocated on heap
        //Student() is a constructor its a function but doesnot return anything
        s1.name = "Tony";
        s1.age = 24;
        s1.printInfo();
        //for parameterized constructor
        Student s2 = new Student("Ari", 25);
        s2.printInfo();
        //for copy constructor
        Student s3 = new Student(s1);
        s3.printInfo();
        //we didnt pass any parameter to s3 but it is able to print the info of s1 because of copy constructor
        //we didnt create any destructor as java has its own destructor which is garbage collector
    }
}