package lab.pkg8.question.pkg7;

import static java.lang.Math.ceil;
import java.text.DecimalFormat;
import java.util.Random;

public class Lab8Question7 {

    public static void main(String[] args) {
        Money afrie = new Money();
        DecimalFormat df = new DecimalFormat("#####.##");
        Random rand = new Random();


                
        double amount = rand.nextDouble()*1000;
        System.out.println(amount);
//
        afrie.roundUp(amount);
        afrie.noteCalculator(amount);
        System.out.printf("RM%.2f\n",amount);
        afrie.showNotes();


}

}
