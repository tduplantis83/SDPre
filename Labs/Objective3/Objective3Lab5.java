/*
TRAVIS DUPLANTIS
8/15/19
OBJECTIVE 3, LAB 5 - FIND THE SUM
*/

import java.util.Scanner;

public class Objective3Lab5
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    double num1, num2;

    System.out.println("Please enter a number:");
    num1 = s.nextDouble();

    System.out.println("Please enter another number:");
    num2 = s.nextDouble();

    System.out.println("The sum of " + num1 + " + " + num2 + " = " + (num1 + num2));

    s.close();
  }
}
