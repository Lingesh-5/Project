import java.util.Arrays;
import java.util.Scanner;
public class ProductMain{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product Id");
        System.out.println("Enter price");
        System.out.println("Enter Quantity");
        
        int[][] product_information = new int[5][3];   //{{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0}} - 2D array
        int highest_price = 0;
        int highest_price_pi = 0;
        
        for(int i = 0;i<5;i++){
            for(int j = 0; j<3;j++){
                product_information[i][j] = sc.nextInt();
            }
        }
        sc.close();

        //Loop to find the Pid of the product with highest price
        for(int i = 0;i<5;i++){         
            for(int j = 1; j<2;j++){
                if(product_information[i][j] > highest_price){
                    highest_price = product_information[i][j];
                    highest_price_pi = product_information[i][j-1];
                }
            }
        }
        System.out.println("5 Product information -"+Arrays.deepToString(product_information));
        System.out.println("Pid of the product with highest price :"+highest_price_pi);
        System.out.println("Total amount spent on all products :"+calculateTotalamt(product_information));

    }
      //Method to calculate total amount spent on all products
      public static int calculateTotalamt(int[][] product_information){
        int totalamt = 0;
        for(int i = 0;i<5;i++){
            for(int j = 1; j<2;j++){
                totalamt += product_information[i][j] * product_information[i][j+1];
            }
        }  
        return totalamt;        
        }
}

class Product{
    int pid;
    int price;
    int quantity;
    
    Product(int pid,int price,int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}