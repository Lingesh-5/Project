import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SchoolMain {
    public static void main(String[] args) {
        
        //List interface to store students name
        List<String> students = new ArrayList<>();
        students.add("Lingesh");
        students.add("Aravind");
        students.add("Ram");
        students.add("Kumar");
        students.add("Raja");
        students.add("Ganesh");
        students.add("Akash");
        students.add("Kavin");
        students.add("Thilak");
        students.add("Arun");
        
        System.out.println("Students in class -->"+students);
        
        //lamda expression and stream API used below, to filter students name starting with 'A'
        //.toList() method used to collect Objects in list
        List<String> special_students = students.stream().filter((item)->item.startsWith("A")).collect(Collectors.toList());
        System.out.println("Students whose name start with 'A' -->"+special_students);
    }
}