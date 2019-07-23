import java.util.Scanner;

public class BMICalculator
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, ft, in;

    System.out.print("Your height (feet only): ");
    ft = keyboard.nextDouble();

    System.out.print("Your height (inches only): ");
    in = keyboard.nextDouble();

    m = (((ft * 12) + in) * 0.0254);

    System.out.print("Your weight in pounds ");
    kg = (keyboard.nextDouble() * 0.453592);

    bmi = kg / (m * m);

    System.out.println("Your BMI is " + bmi);
  }
}
