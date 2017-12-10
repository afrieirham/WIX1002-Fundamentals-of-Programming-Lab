/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;
import java.util.Scanner;
/**
 *
 * @author mfaizmzaki
 */
public class Q2 {
    public Q2(){
        float P,D,R,M;
        int Y;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price of car:");
        P = input.nextFloat();
        
        System.out.println("Enter amount of down payment:");
        D = input.nextFloat();
        
        System.out.println("Enter interest rate in %");
        R = input.nextFloat();
        
        System.out.println("Enter loan duration in Year:");
        Y = input.nextInt();
        
        M = (P - D) * (1 + R * Y/100) / (Y * 12);
        System.out.print("The monthly payment is: ");
        System.out.printf("%.2f\n",M);
    }
}
