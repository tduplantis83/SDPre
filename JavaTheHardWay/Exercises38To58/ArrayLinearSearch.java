/*
TRAVIS DUPLANTIS
8/19/19
JAVA THE HARD WAY
EXERCISE #4 - ARRAYS: FINDING THINGS IN AN ARRAY
*/
import java.util.Scanner;

public class ArrayLinearSearch
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int[] orderNumbers = {12345, 54321, 101010, 8675309, 31415, 271828};
    int toFind;
    boolean found = false;

    System.out.print("There are " + orderNumbers.length);
    System.out.println(" orders in the database.");

    System.out.print("Orders: ");
    for(int num : orderNumbers)
    {
      System.out.print(num + " ");
    }
    System.out.println();

    System.out.print("Which order to find? ");
    toFind = keyboard.nextInt();

    for(int num : orderNumbers)
    {
      if(num == toFind)
      {
        System.out.println(num + " found.");
        found = true;
      }
    }

    if(!found)
    {
      System.out.println("Order number NOT found.");
    }
  }
}

/*STUDY DRILLS
1. No - you cannot declare the for each variable prior to it's initialization statement - you get a compiler error.
*/
