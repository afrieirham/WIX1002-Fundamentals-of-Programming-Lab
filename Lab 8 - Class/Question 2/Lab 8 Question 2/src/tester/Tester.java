package tester;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        
        BankAccount money = new BankAccount("Afrie", "09898768767", 3000);
        
        money.deposit(3000);
        System.out.println("");
        money.withdrawn(2000);
        
        
        
    }
    
}
