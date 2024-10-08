package PolymorphismInJava;

//Method Overriding.

public class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent{
    void show(){
        System.out.println("Child's show()");
    }
}

class Main{
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.show();

        Child c1 = new Child();
        c1.show();

    }
}
