/*
TRAVIS DUPLANTIS
7/28/19
JAVA THE HARD WAY
EXERCISE #13 - Comparing Strings
*/

import java.util.Scanner;

public class WeaselOrNot
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    String word;
    boolean yep, nope;

    System.out.println("Type the word \"weasel\", please.");
    word = keyboard.next();

    yep = "weasel".equals(word); //works both ways
    nope = !word.equals("weasel");

    System.out.println("You typed what was requested: " + yep);
    System.out.println("You ignored polite instructions: " + nope);
  }
}
