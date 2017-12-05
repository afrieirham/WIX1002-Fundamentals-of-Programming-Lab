/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_4;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author mfaizmzaki
 */
public class Q5 {
    
    public Q5(){
        
        int player1 = 0, player2 = 0, dice;
        Random g = new Random();
        
        game:{
        for(int i=0; ;i++) {
            if (i%2==0) {
                do {
                    dice = g.nextInt(6)+1;
                    player1+=dice;
                    System.out.println("Player 1 - Roll Dice: " + dice + " Total: " + player1);
                    if (player1 >100) {
                        System.out.println("Player 1 WIN!");
                        break game;
                    }
                }while(dice==6);
            }
            else {
                do {
                    dice = g.nextInt(6)+1;
                    player2+=dice;
                    System.out.println("Player 2 - Roll Dice: " + dice + " Total: " + player2);
                    if (player2 >100) {
                        System.out.println("Player 2 WIN!");
                        break game;
                    }
                }while(dice==6);
            }
        }
        }

    }
}
