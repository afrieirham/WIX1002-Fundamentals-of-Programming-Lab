/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_4;
import java.util.Random;
/**
 *
 * @author mfaizmzaki
 */
public class Q6 {
    
    public Q6(){
        
        int num, count = 1;
        Random rand = new Random();
        
        num = rand.nextInt(Integer.MAX_VALUE);
        System.out.println("The random integer is " + num);
        
        while(num > 9){
            num /= 10;
            count++;
        }
        System.out.println("It has " + count + " digit(s)");
    }
}
