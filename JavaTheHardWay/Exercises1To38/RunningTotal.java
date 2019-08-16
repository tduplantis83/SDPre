/*
TRAVIS DUPLANTIS
7/28/19
JAVA THE HARD WAY
EXERCISE #30 - Adding Values One at a Time
*/

import java.util.Scanner;

public class RunningTotal
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int current, total = 0;

    System.out.print("Type in a bunch of values and I'll add them up.");
    System.out.println("I'll stop when you type a zero.");


    do
    {
      System.out.print("Value: ");
      current = keyboard.nextInt();
      total += current;
      //study drill 2
      if(current != 0)
      {
        System.out.println("The total so far is: " + total);
      }
    } while (current != 0);


    /* Study drill 1 - convert to use a while loop
    current = 1;
    while(current != 0)
    {
      System.out.print("Value: ");
      current = keyboard.nextInt();
      total += current;
      System.out.println("The total so far is: " + total);
    }
    */
    System.out.println("The final total is: " + total);
  }
}
