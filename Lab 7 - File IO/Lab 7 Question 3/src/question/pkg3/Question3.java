package question.pkg3;

import java.io.*;
import java.util.*;

public class Question3 {

    public static void main(String[] args) throws FileNotFoundException {

        try{

            FileInputStream inputStream = new FileInputStream("normal.txt");
            Scanner input = new Scanner(inputStream);

            FileOutputStream outputStream = new FileOutputStream("reverse.txt");
            PrintWriter printer = new PrintWriter(outputStream);

            while(input.hasNextLine()){

                String line = input.nextLine();
                String reversed = "";

                for(int i=line.length() - 1; i>=0 ; i--){

                    reversed += line.charAt(i);
                }

                printer.println(reversed);
                System.out.println(reversed);

                //System.out.println(line);
            }

            input.close();
            printer.close();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }



    }

}
