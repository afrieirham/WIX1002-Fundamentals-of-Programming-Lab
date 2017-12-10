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
public class Game2 extends Dice{

  // private int dice1 = 0;
  // private int dice2 = 0;
  // private int total = 0;
  // private String name;
  // private boolean gameWin = false;

  private int lastScore = 0;

  public Game2(String name){
    super.name = name;
  }



  public boolean move(){

    dice1 = rollDice();

    total += dice1;
    System.out.println("Total " + name + ": " + total);

    if(dice1 == 6){
      dice2 = rollDice();
      System.out.println(name + " again");
      if(dice2 == 6){
        System.out.println( name + " not valid");
        System.out.println("Total " + name + " after nv: " + total);
        total = total;
        return gameWin = false;
      }
      total += dice2;
      System.out.println("Total " + name + " after 6: " + total);
    }

    lastScore = dice1 + dice2;

    if(total >= 100){
      System.out.println(name + " maybe winning...");
      if(total == 100){
        System.out.println(name + " wins!");
        System.out.println("Score: " + total);
        return gameWin = true;
      }
      else{
        System.out.println(name + " exceeds 100");
        total -= lastScore;
      }
    }

    return gameWin = false;
  }

}
