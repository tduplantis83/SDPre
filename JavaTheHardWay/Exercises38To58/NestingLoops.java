/*
TRAVIS DUPLANTIS
8/19/19
JAVA THE HARD WAY
EXERCISE #46 - NESTED FOR LOOPS
*/

public class NestingLoops
{
  public static void main(String[] args)
  {
    /*
    //this is #1 - I'll call it "CN"
    for(char c = 'A'; c <= 'E'; c++)
    {
      for(int n = 1; n <= 3; n++)
      {
        System.out.println(c + " " + n);
      }
    }
    */
    //STUDY DRILL 2
    for(int n = 1; n <= 3; n++)
    {
      for(char c = 'A'; c <= 'E'; c++)
      {
        System.out.println(c + " " + n);
      }
    }

    System.out.println("\n");

    //this is #2 - I'll call it "AB"
    for(int a = 1; a <= 3; a++)
    {
      for(int b = 1; b <= 3; b++)
      {
        System.out.print("(" + a + ", " + b + ") ");
      }
      //STUDY DRILL 4
      System.out.println();

    }

    System.out.println("\n");
  }
}


/*STUDY DRILLS
  1. THE INNER LOOP CHANGES FASTER

  2. NEW OUTPUT:
  A 1
  B 1
  C 1
  D 1
  E 1
  A 2
  B 2
  C 2
  D 2
  E 2
  A 3
  B 3
  C 3
  D 3
  E 3


  (1, 1) (1, 2) (1, 3) (2, 1) (2, 2) (2, 3) (3, 1) (3, 2) (3, 3)

  3. NEW OUTPUT:
  A 1
  B 1
  C 1
  D 1
  E 1
  A 2
  B 2
  C 2
  D 2
  E 2
  A 3
  B 3
  C 3
  D 3
  E 3


  (1, 1)
  (1, 2)
  (1, 3)
  (2, 1)
  (2, 2)
  (2, 3)
  (3, 1)
  (3, 2)
  (3, 3)

  4. NEW OUTPUT:
  A 1
  B 1
  C 1
  D 1
  E 1
  A 2
  B 2
  C 2
  D 2
  E 2
  A 3
  B 3
  C 3
  D 3
  E 3


  (1, 1) (1, 2) (1, 3)
  (2, 1) (2, 2) (2, 3)
  (3, 1) (3, 2) (3, 3) 

*/
