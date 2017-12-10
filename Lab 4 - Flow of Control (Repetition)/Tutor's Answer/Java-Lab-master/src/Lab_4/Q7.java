/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_4;
import java.util.Scanner;
/**
 *
 * @author mfaizmzaki
 */
public class Q7 {
    
    public Q7(){
        
        double principal, monthlyPayment, interest, principalDue, interestDue, principalBalance, totalInterest=0;
        int totalMonth;
        
        Scanner k = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        
        principal = k.nextDouble();

        System.out.print("Enter interest in %: ");
        interest = k.nextDouble();

        System.out.print("Enter total number of month(s): ");
        totalMonth = k.nextInt();

        monthlyPayment = (principal * interest / 1200) / (1 - Math.pow(1+interest/1200, -1*totalMonth));
            
        System.out.println("Month\tMonthly Payment\tPrincipal\tInterest\tUnpaid Balance\tTotal Interest");
        for(int i=1; i<=totalMonth; i++) {
            principalDue = monthlyPayment * Math.pow(1+interest/1200, -1 * (1+totalMonth-i));
            interestDue = monthlyPayment - principalDue;
            totalInterest+=interestDue;
            principalBalance = interestDue*1200/interest - principalDue;
            System.out.printf("%-5d\t%10.2f\t%9.2f\t",i, monthlyPayment, principalDue);
            System.out.printf("%8.2f\t%14.2f\t%14.2f\n", interestDue, principalBalance,totalInterest);
        }

    }
}
