/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3;
import java.util.Random;
/**
 *
 * @author mfaizmzaki
 */
public class Q4 {
    public Q4(){
        
        Random rand = new Random();
        int player1, player2;
        
        player1 = (1 + rand.nextInt(5)) + (1 + rand.nextInt(5));
        player2 = (1 + rand.nextInt(5)) + (1 + rand.nextInt(5));
        
        if(player1 > player2){
            System.out.println("Player 1 wins. Score: " + player1);
            System.out.println("Player 2 scored " + player2);
        }
        else if(player2 > player1)
        {
            System.out.println("Player 2 wins. Score: " + player2);
            System.out.println("Player 1 scored " + player1);
        }
        else
            System.out.println("It is a draw");
        }
}
