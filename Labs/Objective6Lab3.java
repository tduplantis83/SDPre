public class Objective6Lab3
{
  public static void main(String[] args)
  {
    int counter = 1;

    while(counter < 21)
    {
      System.out.print(counter + " is ");

      if(counter % 2 == 0)
      {
        System.out.println(" even");
      }
      else
      {
        System.out.println(" odd");
      }

      counter += 1;
    }
  }
}
