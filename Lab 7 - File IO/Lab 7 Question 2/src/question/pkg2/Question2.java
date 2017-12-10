package question.pkg2;

import java.util.Scanner;
import java.net.URL;
import java.io.*;
import java.net.URLConnection;

public class Question2 {

    public static void main(String[] args) {

        try {
        URL u = new URL("https://www.facebook.com/");
        URLConnection cnn = u.openConnection();
        InputStream stream = cnn.getInputStream();
        Scanner in = new Scanner(stream);

        FileOutputStream fos = new FileOutputStream("index.htm");
        FileOutputStream fos1 = new FileOutputStream("index.txt");
        PrintWriter printer = new PrintWriter(fos);

        while(in.hasNextLine()){
            printer.println(in.nextLine());
        }

        printer.close();

        }
        catch (IOException e) {
        System.out.println("IO Error:" + e.getMessage());
        }
    }

}
