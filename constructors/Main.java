package constructors;
class BankAccount{
    private double balance ;
    private String name ;

    public BankAccount(double balance , String name){
        this.balance = balance ;
        this.name = name ;
    }

    public void setName(String s){
        name = s ;
    }

    public String getName(){
        return name ;
    }

    public void setBalance(double amount){
         balance = amount ;
    }

    public double getBalance(){
        return balance ;
    }

    public void withdrawBalance(double amount){
        if(amount > balance){
            System.out.println("Insuficient amount ");
        }
        balance -= amount ;
    }

    public void addBalance(double amount){
        balance += amount ;
    }
}


public class Main {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount(0, null);
        obj1.setName("Satej");
        obj1.setBalance(10000);
        System.out.println("The bank name " + obj1.getName() + " have " + obj1.getBalance() + " amount ");
        obj1.withdrawBalance(5000);
        System.out.println("The bank name " + obj1.getName() + " have " + obj1.getBalance() + " amount ");
        obj1.addBalance(155000);
        System.out.println("The bank name " + obj1.getName() + " have " + obj1.getBalance() + " amount ");
    }
}
