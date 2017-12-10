/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg1;

/**
 *
 * @author Afrie Irham
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        add(20);
    }
    
    public static void add(int n){
        int total=0;
        
        for(int i=1 ; i<=n; i++){
            
            System.out.print(i + " ");
            total +=i;
            
            if(i==n)
                break;
            
            System.out.print("+ ");
        }
        System.out.printf("= %d\n", total);
    }
    
}
