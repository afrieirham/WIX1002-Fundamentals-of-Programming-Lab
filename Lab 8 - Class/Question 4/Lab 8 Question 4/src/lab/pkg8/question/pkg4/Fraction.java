/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8.question.pkg4;

/**
 *
 * @author Afrie Irham
 */
public class Fraction {
  private double numerator;
  private double denominator;

  public void setValue(double numerator, double denominator){
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public double getNumerator(){
    return this.numerator;
  }

  public double getDenominantor(){
    return this.denominator;
  }

  public void displayFraction(){

      double a = numerator;
      double b = denominator;

      if(a<b){
          double temp = a;
          a = b;
          b = temp;
      }

      double rem, mid, in;
      double num1 = a;
      double num2 = b;

      do{
          rem = a%b;
          mid = a-rem;
          in = mid/b;
          //System.out.printf("%d = %d(%d) + %d \n", a, b, in, rem);
          a = b;
          b = rem;
      } while(rem>0);
      // System.out.printf("The GCD of %d and %d is %d", num1, num2, a);
      // System.out.println("");
      System.out.println("Lowest term is " + (numerator/a) + "/" +(denominator/a));
  }

}
