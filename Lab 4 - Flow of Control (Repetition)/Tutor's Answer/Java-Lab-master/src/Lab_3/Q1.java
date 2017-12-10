/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3;
import java.util.Scanner;
/**
 *
 * @author mfaizmzaki
 */
public class Q1 {
    public Q1(){
        
        int input1, input2;
        char operand;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter two integer number: ");
        input1 = keyboard.nextInt();
        input2 = keyboard.nextInt();
        
        System.out.println("Enter the operand: ");
        String tempOperand = keyboard.next();
        operand = tempOperand.charAt(0);
        
        switch (operand) {
            case '+':
                int sum = input1 + input2;
                System.out.printf("%d %c %d = %d\n", input1, operand, input2, sum);
                break;
            case '-':
                int minus = input1 - input2;
                System.out.printf("%d %c %d = %d\n", input1, operand, input2, minus);
                break;
            case '*':
                int prod = input1 * input2;
                System.out.printf("%d %c %d = %d\n", input1, operand, input2, prod);
                break;
            case '/':
                int div = input1 / input2;
                System.out.printf("%d %c %d = %d\n", input1, operand, input2, div);
                break;
            case '%':
                int remainder = input1 % input2;
                System.out.printf("%d %c %d = %d\n", input1, operand, input2, remainder);
                break;
            default:
                System.out.println("Answer could not be calculated");
                break;
        }
        
        
        
    }
}
