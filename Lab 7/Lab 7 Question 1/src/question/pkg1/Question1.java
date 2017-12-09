package question.pkg1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String[] code = {"WIX1001" , "WIX1002" , "WIX1003" , "WIA1001"};
        String[] name = {"Computing Mathematics" , "Fundamentals of Programming" , "Computer System and Organisation" , "Network Technology Foundation"};

        try{

            FileOutputStream fStream = new FileOutputStream("course.dat"); //buka buku
            ObjectOutputStream outputStream = new ObjectOutputStream(fStream); //tulis (dekat buku)

            for(int i=0; i<code.length ; i++){
                outputStream.writeUTF(code[i]);
                outputStream.writeUTF(name[i]);
            }

            outputStream.close();

        }catch(IOException e){
            System.out.println(e);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code:");
        String input_code = sc.next();

        try{
            FileInputStream iStream = new FileInputStream("course.dat");
            ObjectInputStream inputStream = new ObjectInputStream(iStream);

            while(true){

                if(input_code.equals(inputStream.readUTF())){
                    System.out.print("Subject: ");
                    System.out.println(inputStream.readUTF());
                    break;
                }

            }

            inputStream.close();

        }catch(EOFException e){
            System.out.println(e);
        }

    }

}
