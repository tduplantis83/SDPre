/*
TRAVIS DUPLANTIS
8/16/19
OBJECTIVE 6, LAB 4 - SUM NUMBERS
*/

public class Objective6Lab4
{
  public static void main(String[] args)
  {
    int counter = 1;
    int sum = 0;

    while(counter < 21)
    {
      sum += counter;

      counter += 1;
    }

    System.out.println(sum);
  }
}
