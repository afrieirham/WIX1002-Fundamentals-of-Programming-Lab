/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9.question.pkg1;

import static java.lang.Math.pow;

/**
 *
 * @author Afrie Irham
 */
public class Circle extends Shape {
    private int diamater;
    private final double PI = 3.14159;

    public void setValue(int diamater){
      this.diamater = diamater;
    }

    public void calPerimeter(){
      super.perimeter = 2 * PI * (diamater/2);
    }

    public void calArea(){
      super.area = PI * pow((diamater/2),2);
    }

}
