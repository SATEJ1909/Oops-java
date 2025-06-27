
class Bankaccount{
    private String accountHoldername ;
    private double balance ;

    public Bankaccount(String accountHoldername , double balance){
        this.accountHoldername = accountHoldername ;
        this.balance = balance ;
    }

    public void setName(String s){
        accountHoldername = s ;
    }

    public String getName(){
        return accountHoldername ;
    }

    public void setBalance(double val){
        balance = val ;
    }

    public double getBalance(){
        return balance ;
    }

    public void withdrawBalance(double amount){
        if(amount > balance){
            System.out.println("Insufficient amount");
        }
        amount -= balance ;
    }

    public void addBalance(double val){
         balance += val ;
    }
}
public class Main {
    public static void main(String[] args) {
        Bankaccount account = new Bankaccount("satej", 10000);
        System.out.println("The account of " + account.getName() + " have " + account.getBalance() + " rupees");
        account.withdrawBalance(2000000);
        System.out.println("The account of " + account.getName() + " have " + account.getBalance() + " rupees");
        

    }
}
