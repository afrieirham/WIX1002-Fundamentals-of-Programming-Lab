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
public class Lab8Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      Burger burger1 = new Burger("Afrie", "123456", 900);
      Burger burger2 = new Burger("Irham", "234567", 700);
      Burger burger3 = new Burger("Akram", "345678", 50);

      burger1.BurgerSold(100);
      burger2.BurgerSold(300);
      burger3.BurgerSold(50);

      burger1.showSold();
      burger2.showSold();
      burger3.showSold();

      burger1.showAllSold();

    }

}
