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
public class Square extends Shape {
  private int length;

  public void setValue(int length){
    this.length = length;
  }

  public void calPerimeter(){
    super.perimeter = 4 * length;
  }

  public void calArea(){
    super.area = length * length;
  }
}
