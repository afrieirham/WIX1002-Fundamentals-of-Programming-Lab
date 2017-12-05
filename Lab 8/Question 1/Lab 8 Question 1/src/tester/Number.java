package tester;

import java.util.Random;

public class Number {
//    int[] number = new int[10];
//    Random input = new Random();
    
    public Number(){
        int[] number = new int[10];
        Random input = new Random();
        for(int i=0; i<10 ; i++){
            number[i] = input.nextInt(101);
            //System.out.println(number[i]);
        }        
    }
    
    public Number(int a){
        int[] number = new int[a];
        Random input = new Random();
        for(int i=0; i<a ; i++){
            number[i] = input.nextInt(101);
            //System.out.println(number[i]);
        }
    }
    
    public Number(int a, int b){
        int[] number = new int[a];
        Random input = new Random();
        for(int i=0; i<a ; i++){
            number[i] = input.nextInt(b+1);
            //System.out.println(number[i]);
        }
    }
    
    
    
//    public void showNum(int a, int b){
//        for(int i=0; i<a ; i++){
//            //number[i] = input.nextInt(b+1);
//            System.out.println(number[i]);
//        }
//    }
    
//    public void showNum(int a){
//        for(int i=0; i<a ; i++){
//            //number[i] = input.nextInt(101);
//            System.out.println(number[i]);
//        }
//    }
//    
//    public void showNum(){
//        for(int i=0; i<10 ; i++){
//            //number[i] = input.nextInt(101);
//            System.out.println(number[i]);
//        }
//    }

}
