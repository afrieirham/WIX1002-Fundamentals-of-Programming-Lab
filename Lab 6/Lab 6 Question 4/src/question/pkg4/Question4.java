/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg4;

/**
 *
 * @author Afrie Irham
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EuclideanAlgorithm(24, 8);
        System.out.println("");
        EuclideanAlgorithm(200,625);
        
    }
    
    public static void EuclideanAlgorithm(int a, int b){
        
        
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        
        int rem, mid, in;
        int num1 = a;
        int num2 = b;
        
        do{
            rem = a%b;
            mid = a-rem;
            in = mid/b;
            System.out.printf("%d = %d(%d) + %d \n", a, b, in, rem);
            a = b;
            b = rem;
        } while(rem>0);
        System.out.printf("The GCD of %d and %d is %d", num1, num2, a);
        System.out.println("");
    }
    
}
