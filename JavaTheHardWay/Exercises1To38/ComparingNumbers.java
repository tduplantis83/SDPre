/*
TRAVIS DUPLANTIS
7/28/19
JAVA THE HARD WAY
EXERCISE #16 - More IF Statements
*/

import java.util.Scanner;

public class ComparingNumbers
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.print("Give me two numbers. First: ");
    first = keyboard.nextDouble();
    System.out.print("Second: ");
    second = keyboard.nextDouble();

      if(first < second)

        System.out.println( first + " is LESS THAN " + second);

      if(first <= second)

        System.out.println( first + " is LESS THAN / EQUAL TO " + second);

      if(first == second)

        System.out.println( first + " is EQUAL TO " + second);

      if(first >= second)

        System.out.println( first + " is GREATER THAN / EQUAL TO " + second);

      if(first > second)

        System.out.println( first + " is GREATER THAN " + second);

      if(first != second)
      {
        System.out.println( first + " is NOT EQUAL TO " + second);
        System.out.println("Hey.");
      }
  }
}

//1. the Hey print is NOT part of the if statement body and prints all the time no matter what
