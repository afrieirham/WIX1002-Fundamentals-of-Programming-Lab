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
public class Q3 {
    public Q3(){
        Random rand = new Random();
        
        int r1 = 10 + rand.nextInt(41);
        int r2 = 10 + rand.nextInt(41);
        int r3 = 10 + rand.nextInt(41);
        
        System.out.printf("%s %2d, %2d and %2d\n", "The three random numbers are:",r1,r2,r3);
        System.out.printf("The sum of the numbers is: %2d\n", r1+r2+r3);
        System.out.printf("The average of the numbers is: %.2f\n", (float)(r1+r2+r3)/3);
    }
}
