public class VoterMain {
    public static void main(String[] args) {
        
        Voter person_one = new Voter(560,"Lingesh",14);        
    }
}
class Voter {
    int voter_id;
    String name;
    int age;
    
    //Parameterized constructor for voter
    Voter(int voter_id,String name, int age) {
        try{
        if(age<18) {
            throw new Exception("invalid age for voter");
        }
        this.voter_id = voter_id;
        this.name = name;
        this.age = age;
        }catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}