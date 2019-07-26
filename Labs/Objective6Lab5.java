import java.util.Scanner;

public class Objective6Lab5
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true)
    {
      System.out.println("______Menu______");
      System.out.println("1: Say Hello");
      System.out.println("2: List my favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();

      if(selection == 1)
      {
        System.out.println("Hello Human");
        System.out.println();
      }
      else if(selection == 2)
      {
        System.out.println("Apple, Banana, Coconut");
        System.out.println();

      }
      else
      {
        System.out.println("Goodbye");
        System.out.println();

        break;
      }
    }

    scanner.close();
  }
}
