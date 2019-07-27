import java.util.Scanner;

public class Objective7Lab3
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int selection;
    boolean cont = true;

    while(cont)
    {
      printMenu();
      selection = scanner.nextInt();
      cont = printResult(selection);
    }

    scanner.close();
  }

  public static void printMenu()
  {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My Favorite Foods");
    System.out.println("3: Exit");
    System.out.println();
  }

  public static boolean printResult(int s)
  {
    if(s == 1)
    {
      System.out.println("Hello Human");
      return true;
    }
    else if (s == 2)
    {
      System.out.println("Apples, Bananas, Coconuts");
      return true;
    }
    else if ( s == 3)
    {
      System.out.println("Goodbye");
      return false;
    }
    else
    {
      System.out.println("ERROR - Try again.");
      return true;
    }
  }
}
