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
public class Q3 {
    public Q3(){
        
        String woops;
        double commission;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter sales volume: ");
        int sales = keyboard.nextInt();
        
        if(sales < 101){
            commission = 0.05 * sales;
            woops = "100 or less";
        }
        else if (sales < 501){
            commission = 0.075 * sales;
            woops = "500 or less";
        }       
        else if (sales < 1001){
            commission = 0.1 * sales;
            woops = "1000 or less";
        }
        else
        {
            commission = 0.125 * sales;
            woops = "1001 above";
        }
        
        System.out.printf("Commission is: %.2f\n%s\n", commission, woops);
    }
}
