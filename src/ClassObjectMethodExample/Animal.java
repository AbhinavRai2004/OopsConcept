package ClassObjectMethodExample;

public class Animal {
    public void eat(){
        System.out.println("I am eating");
    }
    public static void main(String[] args){
        Animal al = new Animal();
        al.eat();
        al.run();
//        al.fly();  it will not work as to access fly method we have to create Bird class objsect.

        Bird sp = new Bird();
        sp.fly();
    }
    public void run(){
        System.out.println("I am running");
    }
}

class Bird{
    public void fly(){
        System.out.println("I am flying");
    }
}
