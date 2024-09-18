package InheritanceInJava;

public class SingleInheritance {
//    The inheritance in which a single derived class is inherited from a single base class is known as the Single Inheritance.

    void sleep(){
        System.out.println("I am sleeping");
    }
}

class B extends SingleInheritance{
    void showB(){
        System.out.println("This is B class");
    }
    public static void main(String[] args) {
        B b1 = new B();
        b1.showB();
        b1.sleep();
    }
}
