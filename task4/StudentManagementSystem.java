public class StudentManagementSystem {
    public static void main(String[] args) {
        
    
        Student student_one = new Student(1,"Lingesh",20,"CSE");
        
        AgeCheck.studentAgeCheck(student_one);
        NameCheck.studentNameCheck(student_one);
        
        Student student_two = new Student(2,"Madhan55",26,"ECE");
        
        //Method call to invoke userdefined exception
        AgeCheck.studentAgeCheck(student_two);
        NameCheck.studentNameCheck(student_two);
        
    }
}
class Student {
    //Student attributes
    int roll_no;
    String name;
    int age;
    String course;
    
    //Parameterized student constructor
    Student(int roll_no, String name, int age, String course){
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

class AgeCheck{
    //Method to check whether age is between 15 and 21
    public static void studentAgeCheck(Student s) {
        try{
        if(s.age<=15||s.age>=21){
            throw new AgeNotWithinRangeException("AgeNotWithinRangeException, age range is between 15 and 21");
        }
        }catch (Exception e){
            System.out.println(e.toString());
        }

        
    }
}
class NameCheck{
    //Method to check whether name contains numbers or special symbols
    public static void studentNameCheck(Student s) {
        try{
            String[] special_char_num = {"!", "@","#", "$", "%", "^", "&","*", "(", ")", "-", "_", "=", "+","/","|","{","}",";",":","/","?",".",">","<","`","0","1","2","3","4","5","6","7","8","9","0"};
            boolean check = false;
            
            for(String element: special_char_num){
            if(s.name.contains(element)){
                check = true;
            }
            }
            if(check){
                throw new NameNotValidException("NameNotValidException, numbers and special symbols are not allowed");
            }

        }catch (Exception e) {
            System.out.println(e.toString());
        }
        
    }
}

//Exception classes
class AgeNotWithinRangeException extends Exception {
    AgeNotWithinRangeException(String message) {
        super(message);
    }
}
class NameNotValidException extends Exception {
    NameNotValidException(String message) {
        super(message);
    }
}