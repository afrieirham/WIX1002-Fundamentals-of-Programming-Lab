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
public class Q2 {
    
    public Q2(){
        
       int n, sum=0;
       Scanner keyboard = new Scanner(System.in);
       
       System.out.print("Enter a number n : ");
       n = keyboard.nextInt();
       
       for(int i=1; i <= n; i++)
       {
           for(int j=1; j<=i; j++)
           {                     
                sum+=j;
           }
       }
        System.out.println("The sum of the series is " + sum);

    }
}
