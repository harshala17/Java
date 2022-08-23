//Compile time polymorphism.
public class Polymorphism {
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(int age,String name){
        System.out.println(age);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Polymorphism polymorphism=new Polymorphism();
        polymorphism.name="Harshala";
        polymorphism.age=20;
        polymorphism.printInfo(polymorphism.age + " " + polymorphism.name);


    }
}
