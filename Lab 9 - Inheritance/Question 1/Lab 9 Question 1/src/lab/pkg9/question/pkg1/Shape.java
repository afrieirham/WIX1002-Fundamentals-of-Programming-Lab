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
public class Shape {

  protected String name;
  protected int perimeter;
  protected int area;

  public void setValue(int perimeter, int area){
    this.perimeter = perimeter;
    this.area = area;
  }

  public int getPerimeter(){
    return this.perimeter;
  }

  public int getArea(){
    return this.area;
  }

  public void showDetails(){
    System.out.println("Shape: " + name);
    System.out.println("Perimeter: " + perimeter);
    System.out.printf("Area: %.2f" , area);
  }

}
