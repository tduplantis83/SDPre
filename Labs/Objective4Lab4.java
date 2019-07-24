import java.util.Scanner;

public class Objective4Lab4
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int userNum;

    System.out.print("Please enter a number: ");
    userNum = s.nextInt();

    if(userNum % 2 == 0)
    {
      System.out.println("\nThe number is even.");
    }
    else
    {
      System.out.println("The number is odd");
    }

  }
}
