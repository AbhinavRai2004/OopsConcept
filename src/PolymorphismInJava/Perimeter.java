package PolymorphismInJava;

//Method overloading.

public class Perimeter {
    void length(int a,int b){
        System.out.println(2*(a+b));
        System.out.println("rectangle");
    }

    void length(int a){
        System.out.println(4 * a);
        System.out.println("Square");
    }

    public static void main(String[] args) {
        Perimeter t = new Perimeter();
        t.length(4);
        t.length(4,5);
    }
}
