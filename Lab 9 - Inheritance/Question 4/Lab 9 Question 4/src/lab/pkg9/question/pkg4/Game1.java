/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9.question.pkg4;

/**
 *
 * @author Afrie Irham
 */
public class Game1 extends Dice{

  public Game1(String name){
    super.name = name;
  }


  public boolean move(){

    dice1 = rollDice();
    dice2 = rollDice();

    total = total + dice1 + dice2;
    System.out.println("Total " + name + ": " + total);

     if(dice1 == dice2){
       System.out.println(name + " again");
       total += rollDice();
       System.out.println("Total " + name + ": " + total);
     }

    if(total >= 100){
      System.out.println( name + " wins!");
      System.out.println("Score: " + total);
      return gameWin = true;

    }

    return gameWin;
  }


}
