/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;
import java.util.Random;
/**
 *
 * @author mfaizmzaki
 */
public class Q5 {
    public Q5(){
        
        Random rand = new Random();
        
        int temp;
        int sum = 0;
        int MAX = 10001;
        int target = rand.nextInt(MAX);
        
        temp = target;
        
        while (temp != 0){
            
            //get last digit 
            int lastDigit = temp%10;
            
            sum += lastDigit;
            
            //remove last digit
            temp /= 10;
        }
        
        System.out.println("The generated number is: " + target);
        System.out.println("The sum of generated number is " + sum);
    }
}
