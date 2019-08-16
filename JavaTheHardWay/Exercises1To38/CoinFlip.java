/*
TRAVIS DUPLANTIS
7/28/19
JAVA THE HARD WAY
EXERCISE #29 - Do-While Loops
*/

import java.util.Scanner;

public class CoinFlip
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    String coin, again;
    int streak = 0;
    boolean gotHeads;

    do
    {
      gotHeads = Math.random() < 0.5;

      if(gotHeads)
      {
        coin = "HEADS";
      }
      else
      {
        coin = "TAILS";
      }

      System.out.println("You flipped a coin and it is... " + coin);

      if(gotHeads)
      {
        streak++;
        System.out.println("\tThat's " + streak + " in a row....");
        System.out.println("\tWould you like to flip again (y/n)");
        again = keyboard.next().toLowerCase();
      }
      else
      {
        System.out.println("\tYou lose everything!");
        System.out.println("\tShould've quit while you were aHEAD....");
        streak = 0;
        again = "n";
      }
    }
    while (again.equals("y"));

    /*study drill 1 - change to a while loop
    again = "y";
    while( again.equals("y"))
    {
      gotHeads = Math.random() < 0.5;

      if(gotHeads)
      {
        coin = "HEADS";
      }
      else
      {
        coin = "TAILS";
      }

      System.out.println("You flipped a coin and it is... " + coin);

      if(gotHeads)
      {
        streak++;
        System.out.println("\tThat's " + streak + " in a row....");
        System.out.println("\tWould you like to flip again (y/n)");
        again = keyboard.next().toLowerCase();
      }
      else
      {
        System.out.println("\tYou lose everything!");
        System.out.println("\tShould've quit while you were aHEAD....");
        streak = 0;
        again = "n";
      }
    }
    */
    System.out.println("Final score: " + streak);
  }
}
