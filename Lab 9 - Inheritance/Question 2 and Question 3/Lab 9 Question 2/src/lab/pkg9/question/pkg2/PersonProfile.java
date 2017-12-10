/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9.question.pkg2;

/**
 *
 * @author Afrie Irham
 */
public class PersonProfile {

  protected String name;
  protected char gender;
  protected String birthDate;

  public PersonProfile(){

  }

  public void showName(){
    System.out.println("Name: " + name);
  }

  public void showGender(){
    System.out.println("Gender: " + gender);
  }

  public void showBirthday(){
    System.out.println("Date of Birth: " + birthDate);
  }




}
