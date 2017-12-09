package lab.pkg8.question.pkg5;

public class Lab8Question5 {

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
