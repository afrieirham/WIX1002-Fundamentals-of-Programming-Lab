/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;

import java.util.Scanner;
/**
 *
 * @author mfaizmzaki
 */
public class Q1 {
    public Q1(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperatur in Fahrenheit:");
        
        float fahrenheit = input.nextFloat();
        System.out.println("The temperature in celcius is:");
        System.out.printf("%3.2f", (fahrenheit - 32)/1.8f);
   
    }
}
