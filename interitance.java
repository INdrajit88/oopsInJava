class Shape{
    public void area(){
        System.out.println("Display area");
    }
}
//Single level inheritance
class Triangle extends Shape{
    public void area(int l, int b){
        System.out.println(1/2*l*b);
    }
}
//Multi level inheritance
class EquilateralTriangle extends Triangle{
    public void area(int l, int b){
        System.out.println(1/2*l*b);
    }
}
//Hierarchial inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}


public class interitance {
    public static void main(String[] args) {
        
    }
}
