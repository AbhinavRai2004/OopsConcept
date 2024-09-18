package InheritanceInJava;

public class HierarchicalInheritance {
//    Hierarchical inheritance is a type of inheritance in which multiple classes inherit from a single superclass.

    void showParent(){
        System.out.println("Hierarchical Class");
    }
}

class X extends HierarchicalInheritance{
    void showX(){
        System.out.println("This is class X");
    }
}

class Y extends HierarchicalInheritance{
    void showY(){
        System.out.println("This is class Y");
    }

    public static void main(String[] args) {
        HierarchicalInheritance h1 = new HierarchicalInheritance();
        h1.showParent();

        System.out.println("------------------------");

        X x1 = new X();
        x1.showParent();
        x1.showX();

        System.out.println("----------------------------");

        Y y1 = new Y();
        y1.showParent();
        y1.showY();
    }

}

