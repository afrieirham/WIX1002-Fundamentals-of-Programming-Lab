package tester;

public class BankAccount {
    private String name, ID;
    private double amount;
    
    public BankAccount(String name, String ID, double amount){
        this.name = name;
        this.ID = ID;
        this.amount = amount;
    }
    
    public void deposit(int amount){
        this.amount += amount;
        System.out.println("Success!");
        System.out.println("Amount deposited: RM" + amount);
        System.out.println("Current balance: RM" + this.amount);
    }
    
    public void withdrawn(int amount){
        if(amount>this.amount){
            System.out.println("Error");
        }
        else{
            this.amount -= amount;
            System.out.println("Success!");
            System.out.println("Amount withdrawn: RM" + amount);
            System.out.println("Current balance: RM" + this.amount);
        }
        
    }
}
