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
public class Q6 {
    public Q6(){
        
        double distance;
        int radius,x,y;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter radius: ");
        radius = keyboard.nextInt();
        System.out.println("Enter coordinate x and y");
        x = keyboard.nextInt();
        y = keyboard.nextInt();
        
        distance = Math.sqrt(x*x + y*y);
        
        if(radius > distance){
            System.out.println("Point (" + x + "," + y + ") is in the circle");
        }
        else
            System.out.println("Point (" + x + "," + y + ") is not in the circle");
    }
}
