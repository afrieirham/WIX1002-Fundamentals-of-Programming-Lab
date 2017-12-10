/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8.question.pkg3;

/**
 *
 * @author Afrie Irham
 */
public class Lab8Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WeightCalculator input = new WeightCalculator();

        input.setVar(19, 165);
        input.weightCal();
        input.display();

    }

}
