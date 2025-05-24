public class PersonMain {
    public static void main(String[] args) {
     
       Person obj = new Person("Ram",22);
       obj.print();
    }
}
class Person {
    String name;
    int age = 18;
    //Constructor
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    //Method to display name and age
    public void print(){
        System.out.println("Name :"+this.name+", Age :"+this.age);
    }
}