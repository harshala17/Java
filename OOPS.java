import bank.*;
class pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }
    public void printColor(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS {
    public static void main(String[] args) {


        Student student=new Student();
        student.name="Harshala";
        student.age=20;
        student.printInfo();




        //
//        pen pen1 = new pen();
//        pen1.color = "Blue";
//        pen1.type="Gel Pen";
//
//        pen pen2= new pen();
//        pen2.color="Pink";
//        pen2.type="Ball Pen";
//        pen1.write();
//        pen1.printColor();
//        pen2.printColor();
    }
}
