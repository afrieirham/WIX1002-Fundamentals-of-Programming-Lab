/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Afrie Irham
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        Random rand=new Random();
        
        int counter=0;
        int start=1;
        int i=0, j=0;
        int[] ans1 = new int[20];
        int[] ans2 = new int[20];
        do
        {
            start++;
            if( start%2 == 0 && start!=2)
                continue;
            else
            {
                int trig=0;
                for( int z=3; z<start; z+=2 )
                {
                    if( start%z == 0 )
                    {
                        trig=1;
                        break;
                    }
                }
                if(trig==1)
                    continue;
            }

            if( palin(start) != 0 && i<20)
            {
                ans1[i]=palin(start);
                i++;
                //System.out.println(ans1[i]);
            }
            else if( emirp(start) != 0 && j<20)
            {
                ans2[j]=emirp(start);
                j++;
                //System.out.println(ans2[j]);
            }
            if( j==20 && i==20)
                counter++;
        }
        while( counter != 1 );
        
        System.out.print("Palindrome = ");
        for( int h=0; h<20; h++)
            System.out.print(ans1[h] + " ");
        System.out.println("");
        System.out.print("Emirp = ");
        for( int h=0; h<20; h++)
            System.out.print(ans2[h] + " ");
    }
    
    public static int palin(int a)
    {
        int up=a;
        int length=0;
        while( up!= 0)
        {
            up=up/10;
            length++;
        }
        up=a;
        int[] temp= new int[length];
        for(int i=length; i>0; i--)
        {
            temp[i-1]=up%10;
            up=up/10;
        }
        
        for(int i=0; i<=length/2; i++ )
        {
            if(temp[i] != temp[length-i-1] )
            {
                return 0;
            }

        }
        return a;
    }
    
    public static int emirp(int a)
    {
        int Aval=0;
        int up=a;
        int length=0;
        while( up!= 0)
        {
            up=up/10;
            length++;
        }
        up=a;
        int[] temp= new int[length];
        for(int i=length; i>0; i--)
        {
            temp[i-1]=up%10;
            up=up/10;
        }
        
        for(int i=0; i<length; i++)
        {
            int mul=(int) Math.pow(10,i);
            Aval+=( temp[i]*mul );
        }
        
            if( Aval%2 == 0 )
                return 0;
            else
            {
                for( int z=3; z<Aval; z+=2 )
                {
                    if( Aval%z == 0 )
                    {
                        return 0;
                    }
                }
            }
            return a;
        
    }
    
}
