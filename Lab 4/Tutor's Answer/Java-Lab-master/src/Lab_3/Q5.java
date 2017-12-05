/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Lab_3;
import java.util.Scanner;
/**
 *
 * @author mfaizmzaki
 */
public class Q5 {
    public Q5(){
        
        Scanner keyboard = new Scanner(System.in);
        double a, b, c, d, e, f, x, y;
        System.out.print("Enter a, b, c, d, e, f :");
        a = keyboard.nextDouble();
        b = keyboard.nextDouble();
        c = keyboard.nextDouble();
        d = keyboard.nextDouble();
        e = keyboard.nextDouble();
        f = keyboard.nextDouble();
        
        if(a*d - b*c == 0){
            System.out.println("The equation has no solution");
        }
        else{
            x = (e*d-b*f)/(a*d-b*c);
            y = (a*f-e*c) / (a*d-b*c);
            System.out.println("X is " + x + " Y is " + y); 
        }
    }
}
