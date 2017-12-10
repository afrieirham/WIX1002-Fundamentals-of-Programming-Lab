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
public class Q8 {
    public Q8(){
  
        Random rand = new Random();
        int num = 3;
        int status = 1 ;
        int n = rand.nextInt(100)+1;
        
        System.out.println("The first " + n + " prime number");
        System.out.print("2");

        for (int i = 2; i <= n;){
            //test for composite number
            for (int j = 2; j <= Math.sqrt(num); j++ ){
                if ( num%j == 0 ){
                    status = 0;
                    break;
                }
            }
            //test for prime
            if ( status != 0 )
            {
                System.out.print(", " +num); 
                i++;
            }
            status = 1;
            num++;        
        } 
        System.out.println("");
    }
}
