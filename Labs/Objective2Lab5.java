public class Objective2Lab5
{
  public static void main(String[] args)
  {
    double side1, side2, hypotenuse;

    side1 = 8;
    side2 = 16;
    hypotenuse = Math.sqrt(Math.pow(side1,2) + Math.pow(side2, 2));

    System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse);
  }
}
