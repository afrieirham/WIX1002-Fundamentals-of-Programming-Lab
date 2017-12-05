/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg2;

import java.util.Scanner;

/**
 *
 * @author Afrie Irham
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c = 0;
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        multiPrint(n);
    }
    
    public static void multiPrint(int n){
        
        for(int i=0 ; i<n ; i++){
            System.out.printf("C ");
        }
    }
    
}
