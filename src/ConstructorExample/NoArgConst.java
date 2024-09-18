package ConstructorExample;

public class NoArgConst {
    String name;
    int i;

    // constructor is created by programmer.
    NoArgConst() {
        name = "Abhi";
        i= 10;
    }

    public static void main(String[] args) {
        NoArgConst obj = new NoArgConst();
        System.out.println(obj.i + " " + obj.name);
    }
}
