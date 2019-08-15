/*
TRAVIS DUPLANTIS
8/15/19
OBJECTIVE 4, LAB 3 - POSITIVE OR NEGATIVE
*/

import java.util.Scanner;

public class Objective4Lab3
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a number: ");
    userNum = scanner.nextInt();

    if(userNum > 0 )
    {
      System.out.println("The number is positive");
    }
    else if(userNum == 0)
    {
      System.out.println("The number is equal to zero");
    }
    else
    {
      System.out.println("The number is negative");
    }

    scanner.close();
  }
}
