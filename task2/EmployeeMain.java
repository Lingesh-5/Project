public class EmployeeMain {
    public static void main(String[] args) {
        
        Employee obj = new Employee("Ram",22);
    }

}
class Person {
    String name;
    int age;
    //Person constructor
    Person(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Name and age value initialized -"+this.name+","+this.age);
    }
    
}

class Employee extends Person{
    int employee_id;
    int salary;
    //Employee constructor
    Employee(String name,int age){
        super(name,age);
    }
}