/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9.question.pkg4;

import java.util.Random;

/**
 *
 * @author Afrie Irham
 */
public class Dice {

  protected int dice1 = 0;
  protected int dice2 = 0;
  protected int total = 0;
  protected String name;
  protected boolean gameWin = false;

  Random input = new Random();

  public int rollDice(){
    return input.nextInt(6) + 1;
  }

}
