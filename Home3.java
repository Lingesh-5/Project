import java.util.Scanner;
public class Home3 {
    public static void main(String[] args) {

        //Code - To find given number is positive or negative
        
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        
        if(a>0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");

        }
    }
}