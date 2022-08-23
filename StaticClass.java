class Student2{
    String name;
    static String school;
}

public class StaticClass {
    public static void main(String[] args) {
        Student2.school="John xxiii high school";
        System.out.println(Student2.school);
    }
}
