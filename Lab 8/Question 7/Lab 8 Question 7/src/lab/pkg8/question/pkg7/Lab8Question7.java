package lab.pkg8.question.pkg7;

import static java.lang.Math.ceil;
import java.text.DecimalFormat;
import java.util.Random;

public class Lab8Question7 {

    public static void main(String[] args) {
        Money afrie = new Money();
        DecimalFormat df = new DecimalFormat("#####.##");
        Random rand = new Random();


        float amount = rand.nextFloat()*1000;
        String amount1 = df.format(amount);
        afrie.noteCalculator(amount);
        System.out.println("RM" + amount1);
        System.out.println("-----");
        afrie.roundUp();
        afrie.showNotes();
}

}
