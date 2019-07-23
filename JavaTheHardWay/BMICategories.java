import java.util.Scanner;

public class BMICategories
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    double bmi, heightFeet, heightInches, heightM, weightKg;

    System.out.print("Enter your Height (Feet portion Only): ");
    heightFeet = keyboard.nextDouble();

    System.out.print("Enter your Height (Inches portion Only): ");
    heightInches = keyboard.nextDouble();

    heightM = (((heightFeet * 12) + heightInches) * 0.0254);

    System.out.print("Enter your Weight in lbs: ");
    weightKg = (keyboard.nextDouble() * 0.453592);

    bmi = weightKg / (heightM * heightM);

    System.out.print("BMI Category: ");
    if(bmi < 15.0)
    {
      System.out.println("very severely underweight");
    }
    else if (bmi <= 16.0)
    {
      System.out.print("severly underweight");
    }
    else if (bmi <= 18.5)
    {
      System.out.print("underweight");
    }
    /*
    if (bmi <= 25.0) //causes the 16.0 if to print, and this one too
    {
      System.out.print("normal weight");
    }*/
    else if (bmi <= 25.0)
    {
      System.out.print("normal weight");
    }
    else if (bmi <= 30.0)
    {
      System.out.print("overweight");
    }
    else if (bmi <= 35.0)
    {
      System.out.print("moderately obese");
    }
    else if (bmi <= 40.0)
    {
      System.out.print("severly obese");
    }
    else
    {
      System.out.print("very severely/\"morbidly\" obese");
    }
  }
}
