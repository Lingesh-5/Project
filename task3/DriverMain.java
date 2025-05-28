import java.util.Scanner;
public class DriverMain {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Employee ID :");
        int emp_id = obj.nextInt();
        System.out.println("Enter Employee name : ");
        String name = obj.next();
        System.out.println("Enter Employee salary :");
        int salary = obj.nextInt();

        Taxable income_tax = new Employee(emp_id, name, salary);
        income_tax.calcTax(); //Calling method to calculate income tax
        
        System.out.println("Enter Product ID :");
        int p_id = obj.nextInt();
        System.out.println("Enter Product price : ");
        int price = obj.nextInt();
        System.out.println("Enter Product quantity :");
        int quantity = obj.nextInt();
        
        Taxable sales_tax = new Product(p_id, price, quantity);
        sales_tax.calcTax(); //Calling method to calculate sales tax
        
        obj.close();


    }
}

// interface
interface Taxable {
    int sales_tax = 7;
    float income_tax = 10.5f;
    public abstract void calcTax();  //abstract method
}
class Employee implements Taxable {
    int emp_id;
    String name;
    float salary;
    float tax;
    
    //Constructor
    Employee(int emp_id, String name, float salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.salary = salary;
        
    }
    @Override
    public void calcTax(){

        tax = (salary*12)*income_tax/100;
        System.out.println("Income Tax = "+(int)tax); // Casting float to int for display
        System.out.println("=========================");
        
    }
}

class Product implements Taxable {
    int p_id;
    int price;
    int quantity;
    int tax;
    
    //Constructor
    Product(int p_id, int price, int quantity) {
        this.p_id = p_id;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public void calcTax(){
        tax = (price/quantity)*sales_tax/100;
        System.out.println("Sales Tax = " +tax);

    }
    
}
