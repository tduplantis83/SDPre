/*
TRAVIS DUPLANTIS
7/28/19
JAVA THE HARD WAY
EXERCISE #34 - Calling Functions to Draw a Flag
*/


import static java.lang.System.*;

public class OverlyComplexFlag
{
  public static void main(String[] args)
  {
    printTopHalf();

    print48Colons();
    print48Ohs();
    print48Colons();
    print48Ohs();
    print48Colons();
    print48Ohs();

    printPledge(); //study drill 2
  }

  public static void print48Colons()
  {
    out.println("|:::::::::::::::::::::::::::::::::::::::::::::|");
  }

  public static void print48Ohs()
  {
    out.println("|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
  }

  public static void print29Colons()
  {
    out.println("|:::::::::::::::::::::::::::::::|");
  }

  public static void printPledge()
  {
    out.println("I pledge allegiance to the flag.");
  }

  public static void print29Ohs()
  {
    out.println("|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
  }

  public static void print6Stars()
  {
    out.print("| * * * * * * ");
  }

  public static void print5Stars()
  {
    out.print("|  * * * * *  ");
  }

  public static void printSixStarLine()
  {
    print6Stars();
    print29Ohs();
  }

  public static void printFiveStarLine()
  {
    print5Stars();
    print29Colons();
  }

  public static void printTopHalf()
  {
    out.println(" _____________________________________________");
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
  }
}
