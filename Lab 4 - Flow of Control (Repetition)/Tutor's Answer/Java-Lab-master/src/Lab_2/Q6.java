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
public class Q6 {
    public Q6(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the amount of water in gram: ");
        double M = input.nextDouble() / 1000;
        
        System.out.println("Enter the initial temperature in Fahrenheit: ");
        double initTemp = (input.nextDouble() - 32) / 1.8;
        
        System.out.println("Enter the final temperature in Fahrenheit: ");
        double finalTemp = (input.nextDouble() - 32) / 1.8;
        
        double Q = M * (finalTemp - initTemp) * 4184;
        System.out.printf("The energy needed is %.6e\n", Q);
    }
}
