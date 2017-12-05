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
public class Q1 {
    
    public Q1(){
    
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter an Integer: ");
        int userInt = keyboard.nextInt();
        
        System.out.print("The factors are: ");
        for(int i=1; i <= userInt; i++)
           if (userInt%i == 0)
           {
              if (userInt == i)
              {
                System.out.println(userInt);
              }
              else
                System.out.print(i + ", ");
           }
        
        
        
}
           
}
