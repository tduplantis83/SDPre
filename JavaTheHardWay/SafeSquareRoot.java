/*
TRAVIS DUPLANTIS
7/28/19
JAVA THE HARD WAY
EXERCISE #28 - Using Loops for Error-Checking
*/

import java.util.Scanner;

public class SafeSquareRoot
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String ready = "NO";

    //study drill 1
    while(!ready.equals("YES"))
    {
      System.out.print("Are you ready? (YES/NO)");
      ready = keyboard.next().toUpperCase();
    }

    System.out.print("Give me a number, and I'll find its square root.");
    System.out.print("(No Negatives, please)");
    x = keyboard.nextDouble();

    while(x < 0)
    {
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of " + x + " is " + y);

  }
}
