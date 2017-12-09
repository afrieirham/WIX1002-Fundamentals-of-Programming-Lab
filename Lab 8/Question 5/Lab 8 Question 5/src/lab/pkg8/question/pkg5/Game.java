/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8.question.pkg5;

import java.util.Random;

/**
 *
 * @author Afrie Irham
 */
public class Game {

    private String name;

    Random rand = new Random();
    public Game(String name){
      this.name = name;
    }

    public int move(){
      return rand.nextInt(6) + 1;
    }

    public String getName(){
      return name;
    }
}
