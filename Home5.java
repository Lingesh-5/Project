import java.util.Scanner;
public class Home5 {
    public static void main(String[] args) {

        // Code
        
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b;
        
        if (a>500 && a<1000){
            b = a * 10/100;
            b = a - b;
        }else if (a>1000){
            b = a * 20/100;
            b = a - b;
        }else {
            b = a;
        }
        System.out.println("Payable amount = "+b);
    }
}