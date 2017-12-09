/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8.question.pkg5;

/**
 *
 * @author Afrie Irham
 */
public class Lab8Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Game P1 = new Game("Afrie");
        Game P2 = new Game("Irham");

        int total1 = 0;
        int total2 = 0;

        while(true){
          total1 += P1.move();
          if(total1 >= 100){
            System.out.println(P1.getName() + " scored " + total1);
            System.out.println(P2.getName() + " scored " + total2);
            System.out.println(P1.getName() + " wins!");
            break;
          }
          total2 += P2.move();
          if(total2 >= 100){
            System.out.println(P2.getName() + " scored " + total2);
            System.out.println(P1.getName() + " scored " + total1);
            System.out.println(P2.getName() + " wins!");
            break;
          }

        }

    }

}
