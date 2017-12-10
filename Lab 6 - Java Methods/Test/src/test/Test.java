/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aerith
 */
public class Test {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Random rand = new Random(); 
        PrintWriter pw = new PrintWriter(new FileOutputStream("integer.txt"));
        for (int i=0; i<10; i++){
            pw.println(rand.nextInt(1001));
        }
        pw.close();

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("integer2.txt"));
        
        for(int i = 0; i < 10; i++)
        {
            int x = rand.nextInt(1001);
            out.writeInt(x);
        }
        out.close();


    }
    



}