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
public class Lab9Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Rectangle rectangleObject = new Rectangle();
        Square squareObject = new Square();
        Circle circleObject = new Circle();

        rectangleObject.name = "Rectangle";
        rectangleObject.setValue(100, 150);
        rectangleObject.calPerimeter();
        rectangleObject.calArea();
        rectangleObject.showDetails();
        System.out.println("");

        squareObject.name = "Square";
        squareObject.setValue(100);
        squareObject.calPerimeter();
        squareObject.calArea();
        squareObject.showDetails();
        System.out.println("");

        circleObject.name = "Circle";
        circleObject.setValue(100);
        circleObject.calPerimeter();
        circleObject.calArea();
        circleObject.showDetails();


    }

}
