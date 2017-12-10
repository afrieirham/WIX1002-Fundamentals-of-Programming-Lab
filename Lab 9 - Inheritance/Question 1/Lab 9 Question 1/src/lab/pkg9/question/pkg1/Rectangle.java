/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9.question.pkg1;

/**
 *
 * @author Afrie Irham
 */
public class Rectangle extends Shape {
    private int length1;
    private int length2;

    public void setValue(int length1, int length2){
      this.length1 = length1;
      this.length2 = length2;
    }

    public void calPerimeter(){
      super.perimeter = (2 * length1) + (2 * length2);
    }

    public void calArea(){
      super.area = length1 * length2;
    }


}
