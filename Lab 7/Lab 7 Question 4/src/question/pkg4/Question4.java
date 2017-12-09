package question.pkg4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

      int line_count = 0;
      int word_count = 0;
      int char_count = 0;

      try{

        FileInputStream inputStream = new FileInputStream("normal.txt");
        Scanner input = new Scanner(inputStream);

        while(input.hasNextLine()){
          String line = input.nextLine();

          line_count++;

          char_count = char_count + line.length();

          for(int i=0; i<line.length(); i++){

            if(line.charAt(i) == ' '){
              word_count++;
            }
          }
          word_count++;
        }

        input.close();

      }catch(IOException e){
        System.out.println(e.getMessage());
      }

      System.out.println(line_count);
      System.out.println(word_count);
      System.out.println(char_count);

    }

}
