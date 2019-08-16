/*
TRAVIS DUPLANTIS
8/16/19
OBJECTIVE 6, LAB 3 - IDENTIFY ODD AND EVEN NUMBERS
*/

public class Objective6Lab3
{
  public static void main(String[] args)
  {
    int counter = 1;

    while(counter < 21)
    {
      if(counter % 2 == 0)
      {
        System.out.println(counter + " is even");
      }
      else
      {
        System.out.println(counter + " is odd");
      }

      counter += 1;
    }
  }
}
