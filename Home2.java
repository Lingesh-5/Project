import java.util.Scanner;
public class Home2 {
    public static void main(String[] args) {

        //code to reverse a given number
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b;
        
        String x = Integer.toString(a);
        b = x.length()-1;

        char[] y = x.toCharArray();
        

        for(int i=b;i>=0;i--){
            System.out.print(y[i]);
        }
        
    }
}