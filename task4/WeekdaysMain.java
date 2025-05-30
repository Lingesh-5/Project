import java.util.Scanner;
public class WeekdaysMain {
    public static void main(String[] args) {
        //Weekdays in Array
        String[] weekdays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter day position:");
        int position = obj.nextInt();
        
        //ArrayIndexOutOfBoundsException Exception handled
        try{
            
        System.out.println(weekdays[position]);
        
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString()+", Enter day position betwwen 0 and 6.");
            
        }

    }
}