/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author course009
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Question 1
        
//        int num, fac, div = 1;
//        
//        System.out.println("Enter an integer");
//        Scanner NUM = new Scanner(System.in);
//        num = NUM.nextInt();
//        
//        System.out.printf("The factors are: ");
//        
//        while (div <= num)
//        {
//            if (num%div == 0)
//            {
//                System.out.printf("%d ", div);
//                div++;
//            }   
//            else
//                div++;
//        }
        
        
        //Question 2
        
//        int m, n, sum = 0, i = 0;
//        
//        Scanner N = new Scanner(System.in);
//        n = N.nextInt();
//        
//        while (n!=0)
//        {
//            while (i<=n)
//            {
//                sum = sum + (n-i);
////                System.out.printf(" %d +" , i);
//                i++;  
//            }
//            //System.out.printf(" + ");
//            i=0;
//            n--;
//        }
//        
//        
//        System.out.printf("Sum = %d\n", sum);
//        System.out.printf("n = %d\n", n);
//        System.out.printf("i = %d\n", i);
        
        
        //Question 3
        
        
//        float sum = 0, score1, score3 = 0; 
//        float min = 100, max = 0, ave = 0;
//        float std = 0, counter = 0, sumsq = 0;
//        
//        
//        do
//        {
//            System.out.println("Enter a score [negative score to quit]: ");
//            Scanner Score1 = new Scanner(System.in);
//            score1 = Score1.nextFloat();
//
//            if (score1<0)
//            {
//                ave = sum/counter;
//                std =(float) sqrt((sumsq - ((sum*sum)/counter))/(counter - 1));
//                break;
//            }
//            
//            else
//            {
//                if (score1>max)
//                    max = score1;
//
//                else if(score1<min)
//                    min = score1;
//                               
//                
//
//            }
//                sum += score1;
//                sumsq += (score1*score1);
//                counter++;
//            
//        }
//        while (score1>=0);
//        
//        System.out.printf("Minimun Score = %.0f\n", min);
//        System.out.printf("Maximum Score = %.0f\n", max);
//        System.out.printf("Average Score = %.2f\n", ave);
//        System.out.printf("Standard Deviation = %.2f\n", std);
        
        
        //Question 4
        
//        int day, year;
//        int MAX = 12;
//        
//        Scanner input = new Scanner (System.in);
//        
//        System.out.print("Enter year : ");
//        year = input.nextInt();
//        
//        System.out.print("Enter day : ");
//        day = input.nextInt();
//        
//        for (int month=1 ; month<= MAX; month++){
//            if (month == 5){
//                System.out.println("May " + year);
//                System.out.println("Sun  Mon  Tue  Wed  Thu Fri  Sat ");
//                for (int d=0; d<day ; d++)
//                    System.out.printf("     ");
//                for (int j=1; j<31; j++){
//                    System.out.printf("%-5d", j);
//                    day++;
//                    day%=7;
//                    if (day==0)
//                        System.out.println("");
//                }
//            }
//            
//            if (month == 8){
//                System.out.println("August " + year);
//                System.out.println("Sun  Mon  Tue  Wed  Thu Fri  Sat ");
//                for (int d=0; d<day ; d++)
//                    System.out.printf("     ");
//                for (int j=1; j<31; j++){
//                    System.out.printf("%-5d", j);
//                    day++;
//                    day%=7;
//                    if (day==0)
//                        System.out.println("");
//                }
//                
//            }
//            
//            else if (month == 2){
//                if ((year/400) || ((year/4) && (year/100)))
//                    day = (day+29)%7;
//                else
//                    day = (day+28)%7;
//            }
//            
//            else if ( month == 4 || month == 6 || month == 9 || month == 11 )
//                day = (day+30)%7;
//            
//            else
//                day = (day+31)%7;
//        }
        
    
        
        
        //Question 5
        
        int P1, P2, sP1 = 0, sP2 = 0;
        
        do
        {
            Random p1 = new Random();          
            P1 = p1.nextInt(6) + 1;
            sP1 += P1;
            System.out.printf("P1 = %d\n", P1);
            System.out.printf("P1 Total Score = %d\n", sP1);
            
            if (P1==6)
                continue;
            else
            {
                Random p2 = new Random();
                P2 = p2.nextInt(6) + 1;
                sP2 += P2;          
                System.out.printf("\t\t\t\tP2 = %d\n", P2);
                System.out.printf("\t\t\t\tP2 Total Score = %d\n", sP2);
                
                if (P2==6)
                {
                    P2 = p2.nextInt(6) + 1;
                    sP2 += P2;          
                    System.out.printf("\t\t\t\tP2 = %d\n", P2);
                    System.out.printf("\t\t\t\tP2 Total Score = %d\n", sP2);
                }
                else
                    continue;
            }
        }while (sP1<100 && sP2<100);
        
        if (sP1>sP2)
        {
            System.out.println("Player 1 Wins");
            System.out.printf("P1 Total Score = %d\n", sP1);
            System.out.printf("P2 Total Score = %d\n", sP2);
        }
        
        else
        {
            System.out.println("Player 2 Wins");
            System.out.printf("P1 Total Score = %d\n", sP1);
            System.out.printf("P2 Total Score = %d\n", sP2);
            
        }
        
        
        //Question 6
        
//        int a;
//        do{
//        Random num = new Random();
//        a = num.nextInt();
//        }
//        while(a<0);
//        
//        if(a>=1000000000)
//            System.out.println("The number of digits is 10");
//        else if(a>=100000000)
//            System.out.println("The number of digits is 9");
//        else if(a>=10000000)
//            System.out.println("The number of digits is 8");
//        else if(a>=1000000)
//            System.out.println("The number of digits is 7");
//        else if(a>=100000)
//            System.out.println("The number of digits is 6");
//        else if(a>=10000)
//            System.out.println("The number of digits is 5");
//        else if(a>=1000)
//            System.out.println("The number of digits is 4");
//        else if(a>=100)
//            System.out.println("The number of digits is 3");
//        else if(a>=10)
//            System.out.println("The number of digits is 2");
//        else
//            System.out.println("The number of digits is 1");
//        System.out.println(a);
        
//        int num, count = 1;
//        Random rand = new Random();
//        
//        num = rand.nextInt(Integer.MAX_VALUE);
//        System.out.print("The random integer is " + num);
//        
//        while(num > 9 ){
//            num /= 10;
//            count++;
//        }
//        
//        System.out.println("");
//        System.out.println("It has " + count + " digit(s)");
        
        //Question 7
        
//        float P, i, M, Cn, Ln, Rn=0, inSum=0;
//        int n=1, N;
//        
//        System.out.printf("Enter the principal amount: ");
//        Scanner p = new Scanner(System.in);
//        P = p.nextFloat();
//        
//        System.out.print("Enter interest in % : ");
//        Scanner I = new Scanner(System.in);
//        i = I.nextFloat();
//        
//        System.out.printf("Enter total number of month(s): ");
//        Scanner ne = new Scanner(System.in);
//        N = ne.nextInt();
//        
//        M =(float)((P*(i/1200))/(1-pow(1+(i/1200),-N)));
//        
//        System.out.println("Month\t\t Monthly Payment\t\t Principal\t\t Interest\t\t Unpaid Balance\t\t Total Interes");
//        do
//        {
//            Cn =(float) (M*(pow((1+(i/1200)),-(1+N-n))));
//
//            Ln =(float) M - Cn;
//
//            Rn =(float) (Ln/(i/1200))-Cn;
//            
//            n++;
//            
//            inSum += Ln;
//            
//            System.out.printf("%d\t\t\t %.2f\t\t\t %.2f\t\t\t %.2f\t\t\t %.2f\t\t %.2f\n", n-1, M, Cn, Ln, Rn, inSum);
//        }
//        while(n <=N);
        
                
        //Question 8
        
        
//        float n,c=1,i;
//        
//        System.out.println("Enter a number: ");
//        Scanner N = new Scanner(System.in);
//        n = N.nextFloat();
//        
//        if (n>0 && n<=100){
//            
//                while (c<=n){
//                    for (i=1; c%i<=0; i++){
//                        if (c==i)
//                            continue;
//                        
//                        System.out.println(c);
//                        
//                    }
//                c++;        
//                }
//                    
//            }
//        
//        else
//            System.out.println("Error");
   
    
    }  }

