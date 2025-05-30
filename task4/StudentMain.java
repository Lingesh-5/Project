import java.util.HashMap;
import java.util.Map;
public class StudentMain {
    //HashMap
    static Map<String,Integer> student_one = new HashMap<>();
    public static void main(String[] args) {

        //Method call
        addStudent("Lingesh",5);
        printStudent("Lingesh");
        removeStudent("Lingesh");
        
    }
    //Method to add new student
    public static void addStudent(String student_name, int grade){
        student_one.put(student_name,grade);
        System.out.println("New Student added successfully.");
    }
    //Method to remove student    
    public static void removeStudent(String student_name){
        student_one.remove(student_name);
        System.out.println("Student removed successfully.");
    }
    //method to display a student grade
    public static void printStudent(String student_name){
        System.out.println(student_name +" grade - "+student_one.get(student_name));
    }
    
}

