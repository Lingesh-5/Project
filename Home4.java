import java.util.Scanner;
public class Home4 {
    public static void main(String[] args) {
  
        //Code - To find the smallest among three numbers
        
        Scanner obj = new Scanner(System.in);
        
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        
        String x;
        
        if(a<b){
            x = "a is small";
        }else{
            x = "b is small";

        }
        
        if(a<c && x.equals("a is small")){
            System.out.println("Smallest ="+a);
        }else if(b<c && x.equals("b is small")){
            System.out.println("Smallest ="+b);
        }else{
            System.out.println("Smallest ="+c);

        }

    }
}