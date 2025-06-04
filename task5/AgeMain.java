import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class AgeMain {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter your birthdate(yyyy-mm-dd): ");
        String str_birthdate = obj.next();
        
        //To convert string to LocalDate
        LocalDate birthdate = LocalDate.parse(str_birthdate);
        //To get current date
        LocalDate localdate = LocalDate.now();
        
        //Period is used to calculate period between two dates
        Period age = Period.between(birthdate, localdate);
        System.out.println("Your age is: "+age.getYears()+" years, "+age.getMonths()+" months, "+age.getDays()+" days.");

    }
}