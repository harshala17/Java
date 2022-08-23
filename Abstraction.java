abstract class Animal{
    abstract void walk(); //no need to implement in abstract
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}


public class Abstraction {
    public static void main(String[] args) {
                Horse horse=new Horse();
                horse.walk();
                Chicken chicken=new Chicken();
                chicken.walk();
    }
}
