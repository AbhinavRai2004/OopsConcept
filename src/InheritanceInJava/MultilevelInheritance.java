package InheritanceInJava;

public class MultilevelInheritance {
//   Multilevel inheritance is a type of inheritance in object-oriented programming where a class inherits from another class, which is in turn derived from another class.

    void showName(){
        System.out.println("This is MultipleInheritance class");
    }
}

class A extends MultilevelInheritance{
    void showChild1Name(){
        System.out.println("This is class A");
    }
}

class C extends A{
    void showChild2Name(){
        System.out.println("This is class B");
    }

    public static void main(String[] args) {
        MultilevelInheritance m1 = new MultilevelInheritance();
        m1.showName();
//        m1.showChild1Name();  this will not work
        System.out.println("------------------------------------");

        A a1 = new A();
        a1.showName();
        a1.showChild1Name();
//        a1.showChild2Name();  this will not work
        System.out.println("------------------------------------");

        C c1 = new C();
        c1.showName();
        c1.showChild1Name();
        c1.showChild2Name();

    }

}
