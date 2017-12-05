/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3;

import static java.lang.Math.sqrt;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Afrie Irham
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Question 1
        /*
        float a,b, ans;
        int check;
        
        do {
        System.out.println("Enter 2 integer number: ");
        Scanner A = new Scanner (System.in);
        a = A.nextFloat();
        
        Scanner B = new Scanner (System.in);
        b = B.nextFloat();
        
        System.out.println("Enter the operand ( + , - , * , / ): ");
        Scanner input = new Scanner (System.in);
        char c = input.next().charAt(0);
        
        switch(c)
        {
            case '+':
                ans = a + b;
                System.out.printf("%.2f + %.2f = %.2f\n", a, b, ans);
                break;
            case '-':
                ans = a - b;
                System.out.printf("%.2f - %.2f = %.2f\n", a, b, ans);
                break;
            case '*':
                ans = a * b;
                System.out.printf("%.2f * %.2f = %.2f\n", a, b, ans);
                break;
            case '/':
                ans = a / b;
                System.out.printf("%.2f / %.2f = %.2f\n", a, b, ans);
                break;
            default : System.out.println("Error\n");
        }
        
        System.out.println("Enter 1 to continue, 0 to exit");
        Scanner chk = new Scanner(System.in);
        check = chk.nextInt();
        }
        while (check==1);
        */
        
        //Question 2
        /*
        int Num;
        
        Random rand = new Random();
        Num = rand.nextInt(6);
        
        switch(Num)
        {
            case 0:
                    System.out.printf("%d is zero \n", Num);
            break;
            
            case 1:
                    System.out.printf("%d is one \n", Num);
            break;   
            
            case 2:
                    System.out.printf("%d is two \n", Num);
            break;
            
            case 3:
                    System.out.printf("%d is three \n", Num);
            break;
            
            case 4:
                    System.out.printf("%d is four \n", Num);
            break;   
            
            case 5:
                    System.out.printf("%d is five \n", Num);
            break; 
        }        
        */
        
        //Question 3
        /*
        float com;
        
        System.out.println("Enter the volume of sales:");
        Scanner input = new Scanner(System.in);
        float sales = input.nextFloat();
        
        if (sales >=0 &&sales <=100)
        {
            com = (5/100)*sales;
            System.out.printf("Commission = RM%.2f\n", com);
        }
        
        else if (sales>100 && sales<=500)
        {
            com = (float) (7.5/100)*sales;
            System.out.printf("Commission = RM%.2f\n", com);
        }
        
        else if (sales>500 && sales<=1000)
        {
            com = (float) (10/100)*sales;
            System.out.printf("Commission = RM%.2f\n", com);
        } 
        
        else if (sales>1000)
        {
            com = (float) (12.5/100)*sales;
            System.out.printf("Commission = RM%.2f\n", com);
        }
        
        else
            System.out.println("Error");
        */
        
        //Question 4
        /*
        int a, b, c, d,  P1, P2;
        
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        Random rand4 = new Random();
        
        a = rand1.nextInt(6) + 1;
        b = rand2.nextInt(6) + 1;
        c = rand3.nextInt(6) + 1;
        d = rand4.nextInt(6) + 1;
        
        P1 = a + b;
        P2 = c + d;
        
        System.out.println("First round:");
        System.out.printf("Player 1 = %d\n", a);
        System.out.printf("Player 2 = %d\n", c);
        
        System.out.println("\nSecond round:");
        System.out.printf("Player 1 = %d\n", b);
        System.out.printf("Player 2 = %d\n\n", d);
        
        System.out.printf("Player 1: %d + %d = %d\n", a, b, P1);
        System.out.printf("Player 2: %d + %d = %d\n\n", c, d, P2);
        
        if (P1 > P2)
            System.out.println("Player 1 win");
        
        else if (P1 < P2)
            System.out.println("Player 2 win");
        
        else
            System.out.println("Tie");
        */
       
        
        //Question 5
        
        /*
        float a, b, c, d, e, f, check;
        float x, y;
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");
        System.out.println("Enter for each alphabet:");
        
        System.out.println("a?");
        Scanner in1 = new Scanner(System.in);
        a = in1.nextFloat();
        
        System.out.println("b?");
        Scanner in2 = new Scanner(System.in);
        b = in2.nextFloat();
        
        System.out.println("c?");
        Scanner in3 = new Scanner(System.in);
        c = in3.nextFloat();
        
        System.out.println("d?");
        Scanner in4 = new Scanner(System.in);
        d = in4.nextFloat();
        
        System.out.println("e?");
        Scanner in5 = new Scanner(System.in);
        e = in5.nextFloat();
        
        System.out.println("f?");
        Scanner in6 = new Scanner(System.in);
        f = in6.nextFloat();
        
        check = a*d - b*c;
        
        if (check == 0)
            System.out.println("The equation has no solution");
        
        else
        {  
            
            x = (e*d - b*f)/(a*d - b*c);
            y = (a*f - e*c)/(a*d - b*c);
            
            System.out.printf("x = %f\n", x);
            System.out.printf("y = %f\n", y);
        }
        */
        
        //Question 6
        /*
        double rad, x, y, dis;
        
        System.out.println("Enter radius:");
        Scanner RAD = new Scanner(System.in);
        rad = RAD.nextDouble();
        
        System.out.println("Enter x coordinate:");
        Scanner X = new Scanner(System.in);
        x = X.nextDouble();
        
        System.out.println("Enter y coordinate:");
        Scanner Y = new Scanner(System.in);
        y = Y.nextDouble();
        
        dis = sqrt((x*x)+(y*y));
        
        if(dis>rad)
            System.out.println("The coordinate is outside the circle");
        
        else if(dis<rad)
            System.out.println("The coordinate is inside the circle");
        
        else
            System.out.println("The coordinate is on the circle");
        */
    }

}
