package lab.pkg7.question.pkg5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Lab7Question5 {

    public static void main(String[] args) {

      int TotalNumberofRecord;
      String Name;
      int Age;
      char Gender;
      try{
        ObjectInputStream inputStream = new ObjectInputStream( new FileInputStream("person.dat"));
        Scanner input = new Scanner(inputStream);

        while(true){
          Name = input.next();
          if(input.hasNextInt()){
              
          }
        }


        inputStream.close();
      }
      catch(IOException e){
        System.out.println(e.getMessage());
      }


      System.out.println(number);

    }

}
