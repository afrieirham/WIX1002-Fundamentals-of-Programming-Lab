/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3;
import java.util.Random;
/**
 *
 * @author mfaizmzaki
 */
public class Q2 {
    public Q2(){
        
        int rand = new Random().nextInt(6);
        
        switch(rand){
            case 1:
                System.out.println(rand + " is one");
                break;
            case 2:
                System.out.println(rand + " is two");
                break;
            case 3:
                System.out.println(rand + " is three");
                break;
            case 4:
                System.out.println(rand + " is four");
                break;
            case 5:
                System.out.println(rand + " is five");
                break;
            default:
                System.out.println(rand + " is zero");
        }     
    }
}
