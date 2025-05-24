public class AccountMain {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.depositAmount(1000);
        obj.withdrawAmount(500);
        obj.printBalance();
 
 
    }
}
class Account{
    int balance;
    Account(){
        System.out.println("Initial balance amount: "+this.balance);
    }
    Account(int deposit_amt,int withdraw_amt){
        System.out.println("Amount to deposit: "+deposit_amt+", Amount to withdraw: "+withdraw_amt);
    }
    //Method to deposit amount
    public void depositAmount(int amt){
        this.balance = this.balance + amt;
    }
    //Method to withdraw amount
    public void withdrawAmount(int amt){
        this.balance = this.balance - amt;
    }
    //Method to print balance amount
    public void printBalance(){
         System.out.println("Balance amount: "+this.balance);
    }
}