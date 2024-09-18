package ConstructorExample;

public class ParametricConst {
    int i;
    String name;

    ParametricConst(int i,String name){
        this.i = i;
        this.name = name;
    }

    public static void main(String[] args) {
        ParametricConst p1 = new ParametricConst(10,"Abhi");
        System.out.println(p1.i + " " + p1.name);
    }
}
