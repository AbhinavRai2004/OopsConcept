package InheritanceInJava;

public class MultipleInheritance {
//    The inheritance in which a single derived class is inherited from a single base class is known as the Single Inheritance.

    void showName(){
        System.out.println("This is MultipleInheritance class");
    }
}

class A extends MultipleInheritance{
    void showChild1Name(){
        System.out.println("This is class A");
    }
}

class C extends A{
    void showChild2Name(){
        System.out.println("This is class B");
    }

    public static void main(String[] args) {
        MultipleInheritance m1 = new MultipleInheritance();
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
