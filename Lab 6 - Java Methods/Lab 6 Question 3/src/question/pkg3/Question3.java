/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Afrie Irham
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Scanner input = new Scanner(System.in);
        Random input = new Random();
    
        int[] num = new int[10];
        int[] temp = new int[10];
        System.out.println("Input numbers:");
        for(int i=0; i<10; i++){
            num[i]=input.nextInt(5000);
            System.out.println(num[i]);
            num[i]=swap(num[i]);
        }
        
        
        //Masukkan array dalam array baru
        for(int i=0; i<10; i++){
            temp[i]=num[i];
        }
        
        //Tukar array
        for(int i=9; i>=0; i--){
            num[i] = temp[9-i];
        }
        
        
        System.out.println("");
        System.out.println("Swapped numbers and arrays");
        for(int i=0; i<10; i++){
            System.out.println(num[i]);
        }
    }
    


    public static int swap(int a){
        int num=a;
        int length=0;
        int ans=0;
        
        //Nak kira nombor tu berapa panjang
        do{
            num/=10;
            length++;
        }
        while (num != 0 );

        num=a;

        //Nak terbalikkan nombor
        for( int i=1; i<=length; i++){
            int b=num%10; //Nak extract nombor belakang
            num/=10; //Update nombor lepas buang nombor belakang
            int mul=(int) Math.pow(10,(length-i)); //Nombor belakang letak depan
            ans+=(b*mul); 
        }
        
        return ans;
    }
}