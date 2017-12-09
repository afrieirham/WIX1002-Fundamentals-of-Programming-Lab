package lab.pkg8.question.pkg3;

public class WeightCalculator {
  int age;
  int height;
  int recWeight;

  public void setVar(int age, int height){
    this.age = age;
    this.height = height;
  }

  public void weightCal(){
    recWeight = (int) ((height - 100 + age/10) * 0.9);
  }

  public void display(){
    System.out.println("Age = " + age);
    System.out.println("Height = " + height + "cm");
    System.out.println("Recommended Weight = " + recWeight + "kg");
  }

}
