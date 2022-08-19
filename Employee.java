public class Employee {
    private int salary;
    String name;
    int id;
    Employee(){

    }
    Employee(int salary,String name,int id){  //Parameterized Constructor.
        this.salary=salary;
        this.name=name;
        this.id=id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        int responseSalary;


            Employee employee1=new Employee();
            employee1.setId(1);

            employee1.setName("Harshala");
            employee1.setSalary(40000);
            responseSalary= employee1.getSalary();
            System.out.println(responseSalary);





    }
}

