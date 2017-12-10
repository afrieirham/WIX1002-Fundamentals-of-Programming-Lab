/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8.question.pkg7;

/**
 *
 * @author Afrie Irham
 */
public class Money {

    private static double amount;

    private int counter100;
    private int counter50;
    private int counter10;
    private int counter5;
    private int counter1;

    private double counter_50;
    private double counter_20;
    private double counter_10;
    private double counter_5;
    
    private float ans = 0;

  public void noteCalculator(double amount){
    counter100 = (int) (amount/100);
    counter50 = (int) ((amount%100)/50);
    counter10 = (int) (((amount%100)%50)/10);
    counter5 = (int) ((((amount%100)%50)%10)/5);
    counter1 = (int) ((((amount%100)%50)%10)%5)/1;

    counter_50 = (((((amount%100)%50)%10)%5)%1)/0.5;
    counter_20 = ((((((amount%100)%50)%10)%5)%1)%0.5)/0.2;
    counter_10 = (((((((amount%100)%50)%10)%5)%1)%0.5)%0.2)/0.1;
    counter_5 = ((((((((amount%100)%50)%10)%5)%1)%0.5)%0.2)%0.1)/0.05;

  }

  public void roundUp(double number){
    int test = (int) ((number * 100) % 100);
    int ten = test/10;
    int one = test%10;
    switch(one){
            case 0:
            case 1: 
            case 2: ans = (ten*10);
                break;
            case 3:
            case 4:
            case 5:
            case 6: 
            case 7: ans = (ten*10) + 5;
                break;
            case 8: 
            case 9: ans = (ten*10) + 10;
                break;
        }
    
    ans /= 100;
    float sub = (float) amount % 1;
    amount = amount - sub;
    amount = amount + ans;
    System.out.printf("Rounded = %.2f\n" , amount);
  }

  public void showNotes(){
    System.out.println("RM100 = " + counter100);
    System.out.println("RM50 = " + counter50);
    System.out.println("RM10 = " + counter10);
    System.out.println("RM5 = " + counter5);
    System.out.println("RM1 = " + counter1);

    System.out.printf("50 sen = %.0f\n" , counter_50);
    System.out.printf("20 sen = %.0f\n" ,counter_20);
    System.out.printf("10 sen = %.0f\n" ,counter_10);
    System.out.printf("5 sen = %.0f\n" , counter_5);

  }



}
