/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8.question.pkg6;

/**
 *
 * @author Afrie Irham
 */
public class Burger {

    private String stallName;
    private String id;
    private int noBurgerSold;
    public static int totalSold;

  public Burger(String stallName, String id, int noBurgerSold){
    this.stallName = stallName;
    this.id = id;
    this.noBurgerSold = noBurgerSold;
    totalSold += noBurgerSold;
  }

  public void BurgerSold(int noBurgerSold){
    this.noBurgerSold += noBurgerSold;
    totalSold += noBurgerSold;
  }

  public void showSold(){
    System.out.println("The number of burger sold by " + stallName + " is " + noBurgerSold);
  }

  public void showAllSold(){
    System.out.println("The total number of burger sold is " + totalSold);
  }

}
