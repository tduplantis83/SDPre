/*
TRAVIS DUPLANTIS
8/15/19
OBJECTIVE 4, LAB 4 - ODD OR EVEN
*/
import java.util.Scanner;

public class Objective4Lab4
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    double num;

    System.out.println("Please enter a number:");
    num = s.nextDouble();

    if(num % 2 == 0)
    {
      System.out.println("The number is even");
    }
    else
    {
      System.out.println("The number is odd");
    }

    s.close();
  }
}
