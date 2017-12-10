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
  protected double perimeter;
  protected double area;

  public void setValue(int perimeter, int area){
    this.perimeter = perimeter;
    this.area = area;
  }

  public double getPerimeter(){
    return this.perimeter;
  }

  public double getArea(){
    return this.area;
  }

  public void showDetails(){
    System.out.println("Shape: " + name);
    System.out.println("Perimeter: " + perimeter);
    System.out.printf("Area: %.2f\n" , area);
  }

}
