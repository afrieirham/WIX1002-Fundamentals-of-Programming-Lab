/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2q1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author course009
 */
public class L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
            
    {
        //QUESTION 1
        /*
        double Cel;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:" );
        double fah = input.nextDouble();
        
        Cel = (fah - 32) / 1.8;
        
        System.out.printf("%.2f F = %.2f C \n", fah, Cel);
        */
        
        //QUESTION 2
        /*
        double P, D, R, M , Y;
        
        Scanner p = new Scanner(System.in);
        System.out.println("Enter the price of the car: ");
        P = p.nextDouble();
        
        Scanner d = new Scanner(System.in);
        System.out.println("Enter the Down Payment: ");
        D = d.nextDouble();
        
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the interest rate in %: ");
        R = r.nextDouble();
        
        Scanner y = new Scanner(System.in);
        System.out.println("Enter the Loan duration in year: ");
        Y = y.nextDouble();
        
        M = (P - D)*(1 + R*Y/100)/(Y*12);
        
        System.out.printf("Monthly payment = RM %.2f\n", M);
        */
        
        //QUESTION 3
        
        /*
        Random A = new Random();
        int x = A.nextInt(40) + 11;
        
        Random B = new Random();
        int y = B.nextInt(40) + 11;
        
        Random C = new Random();
        int z = C.nextInt(40) + 11;
        
        double sum = x + y + z;
        double ave = sum/3;
        
        System.out.printf("The 3 numbers are:\n");
        System.out.printf("%d, %d, %d\n\n\n", x, y, z);
        System.out.printf("Sum = %.2f\n", sum);
        System.out.printf("Average = %.2f\n", ave);
        */
        
        //QUESTION 4
        /*
        int H, M, S, Hr, Mr;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");
        int sec = input.nextInt();
        H = sec / 3600;
        Hr = sec % 3600;
        M = Hr / 60;
        Mr = Hr % 60;
        S = Mr;
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds \n", sec, H, M, S);
        */
        
        //QUESTION 5
        
        int rnd, sum = 0, TT, T, H, Th, O, TTr, Tr, Hr, Thr;
        Random input = new Random();
        rnd = input.nextInt(10001);
        
        TT = rnd/10000;
        TTr = rnd%10000;
        T = TTr/1000;
        Tr = rnd%1000;
        H = Tr/100;
        Hr = rnd%100;
        Th = Hr/10;
        Thr = rnd%10;
        O = Thr/1;
        
        sum = TT + T + H + Th + O;
        
        System.out.printf("%d\n%d\n", rnd, sum);
        
        
        //QUESTION 6
        /*
        double Q;
        
        Scanner M = new Scanner(System.in);
        System.out.println("Enter the amount of water in gram: ");
        double m = M.nextDouble();
        m = m/1000;
        
        Scanner I = new Scanner(System.in);
        System.out.println("Enter the initial temperature in Fahrenheit: ");
        double i = I.nextDouble();
        i = (i - 32)/1.8;
        
        Scanner F = new Scanner(System.in);
        System.out.println("Enter the final temperature in Fahrenheit: ");
        double f = F.nextDouble();
        f = (f - 32)/1.8;
        
        Q = m*(f-i)*4184;
        
        System.out.printf("The energy needed is %e\n", Q);
        */
    }
    
}
