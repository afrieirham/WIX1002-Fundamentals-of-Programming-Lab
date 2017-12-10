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
public class Q4 {
    public Q4(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of secods: ");
        int userInput = input.nextInt();
        
        int hour = userInput/3600;
        int seconds = userInput%3600;
        int minutes = seconds/60;
        seconds %= 60;
        
        System.out.printf("The answer is: %d hours %d minutes and %d seconds\n", hour, minutes, seconds);
        
    }
}
