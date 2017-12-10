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
public class Q3 {
    
    public Q3(){
        
        int min = 0, max = 0, sum = 0, sumsq = 0, cnt = 0;
        double avg, std;
        
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("Enter a score [negative score to quit]: ");
        int num = keyboard.nextInt();
        
        if(num < 0){
            System.exit(0);
        }
        else{
            cnt++;
            sum += num;
            sumsq += num*num;
            max = num;
            min = num;
        }
        while(num > 0){
            System.out.println("Enter a score [negative score to quit]: ");
            num = keyboard.nextInt();
            
            if(num < 0){
                break;
            }
            else{             
                sum += num;
                sumsq += num*num;
                if(num > max){
                    max = num;
                }
                if (num < min){
                    min = num;
                }
                cnt++;
            }      
        }
        avg = sum/cnt;
        std = Math.sqrt((sumsq - sum*sum/cnt)/(cnt-1.0));
        
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.printf("Average Score: %.2f\n", avg);
        System.out.printf("Standard Deviation: %.2f\n", std);

    }
}
