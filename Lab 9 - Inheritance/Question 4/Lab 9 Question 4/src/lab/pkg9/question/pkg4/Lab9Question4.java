/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9.question.pkg4;

import java.util.Scanner;

/**
 *
 * @author Afrie Irham
 */
public class Lab9Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean gameWin = false;
        String name1;
        String name2;

        Scanner input = new Scanner(System.in);

        System.out.println("Select your game: ");
        System.out.println("1 - Game 1");
        System.out.println("2 - Game 2");

        int selector = input.nextInt();

        switch(selector){
          case 1:

            System.out.print("Enter name for Player 1: ");
            name1 = input.next();

            System.out.print("Enter name for Player 2: ");
            name2 = input.next();

            Game1 P1 = new Game1(name1);
            Game1 P2 = new Game1(name2);
            while(gameWin == false){

            gameWin = P1.move();
            gameWin = P2.move();
            }
          break;

          case 2:

            System.out.print("Enter name for Player 1: ");
            name1 = input.next();

            System.out.print("Enter name for Player 2: ");
            name2 = input.next();

            Game2 P3 = new Game2(name1);
            Game2 P4 = new Game2(name2);
            while(gameWin == false){
              gameWin = P3.move();
              gameWin = P4.move();
            }
          break;
        }






    }

}
