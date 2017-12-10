/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Afrie Irham
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Question 1
        
//        int N, i=0, Max=0, Min=100, sum=0;
//        float ave;
//        
//        Scanner n = new Scanner(System.in);
//        
//        System.out.print("Enter the number of student: ");
//        N = n.nextInt();
//        
//        System.out.println();
//        
//        int[] score = new int[N];
//        
//        Random input = new Random();
//        
//        do{
//            
//            score[i] = input.nextInt(100);
//            System.out.printf("Student %d = %d\n", i+1, score [i]);
//
//            if(score[i] >Max)
//                Max = score[i];
//                                 
//            if(score[i]<Min)
//                Min = score[i];
//     
//            sum += score[i];
//            i++;
//            
//            
//        } while(i<N);
//        
//        ave = (float) sum/i;
//        
//        System.out.printf("\nHighest Score = %d\n", Max);
//        System.out.printf("Lowest Score = %d\n", Min);
//        System.out.printf("Average Score = %.2f\n", ave);
        
        //Question 2
        
//        int[] num = new int[10];
//       
//        Random N = new Random();       
//       
//        for (int i = 0 ; i<10 ; i++){
//            num[i] = N.nextInt(21);
//            for (int j = 0 ; j<i ; j++){
//                if (num[i] == num[j]){
//                    i--;
//                    break; 
//                }
//            }
//            //System.out.println(num[i]);
//            
//        }
//        
//        System.out.println("");
//        System.out.println("");
//        for (int i = 0 ; i<10 ; i++){
//                System.out.println(num[i]);
//            }
    

       
        //Question 3
        
//        int total = 0, counter = 0;
//        int[] day = new int[7];
//        
//        Random hour = new Random();
//        Scanner Worker = new Scanner(System.in);
//        
//        System.out.printf("Enter the number of worker: ");
//        int worker = Worker.nextInt();
//        System.out.println();
//        
//        do
//        {
//            System.out.printf("Worker %d\n", counter + 1);
//            
//            for(int i=0 ; i<7 ; i++){
//                day[i] = hour.nextInt(8) + 1;
//            }
//
//            for(int i=0 ; i<7 ; i++){
//                System.out.printf("Day %d: %d hour(s)\n", i+1, day[i]);
//            }
//
//            for(int i=0 ; i<7 ; i++){
//                total+= day[i];
//            }
//
//            System.out.println();
//            System.out.print("Total: ");
//            System.out.println(total + " hours");
//            System.out.println();
//            System.out.println();
//            
//            counter++;
//            total = 0;
//            
//        } while(counter < worker);
        
        
        //Question 4
        
//        int[][] matrix = {{1,5,7}, {3,6,9}, {5,3,8}};
//        int[][] matrix2 = new int[3][3];
//        
//        System.out.println("3 by 3 Matrix");
//        for(int i=0 ; i<3 ; i++){
//            for(int j=0 ; j<3 ; j++){
//                System.out.printf("%d\t", matrix [i][j]);
//            }
//            System.out.println("");
//            System.out.println("");
//        }
//        
//        System.out.println("");
//        System.out.println("After rotates 90 degrees clockwise");
//        matrix2[0][0] = matrix[2][0];
//        matrix2[0][2] = matrix[0][0];
//        matrix2[2][2] = matrix[0][2];
//        matrix2[2][0] = matrix[2][2];
//        
//        matrix2[1][0] = matrix[2][1];
//        matrix2[0][1] = matrix[1][0];
//        matrix2[1][2] = matrix[0][1];
//        matrix2[2][1] = matrix[1][2];
//        
//        matrix2[1][1] = matrix[1][1];
//        
//        for(int i=0 ; i<3 ; i++){
//            for(int j=0 ; j<3 ; j++){
//                System.out.printf("%d\t", matrix2 [i][j]);
//            }
//            System.out.println("");
//            System.out.println("");
//        }
        
        //Question 5
        
//        int [] num = new int[20];
//                
//        Random input = new Random();
//        
//        for (int i=0 ; i<20 ; i++){
//            num[i] = input.nextInt(101);
//        }
//        
//        System.out.println("A list of 20 random integer: ");
//        for(int i=0 ; i<20 ; i++){
//            System.out.print(num[i] + " ");
//        }
//        System.out.println("");
//        
//        System.out.println("Array in desending order: ");
//        for(int i=0 ; i<20 ; i++){
//            for(int j=0 ; j<i ; j++){
//                if (num[i]>num[j]){
//                    int temp = num[i];
//                    num[i] = num[j];
//                    num[j] = temp;
//                }                                   
//            }
//        }
//        
//        for(int i=0 ; i<20 ; i++){
//            System.out.print(num[i] + " ");
//        }
        
        //Question 6
        
        Scanner input =  new Scanner(System.in);
        
        int a = input.nextInt();
        
        int[] [] Pascal = new int[a][a];
        
              

    
    }}

