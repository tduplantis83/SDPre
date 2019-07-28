/*
TRAVIS DUPLANTIS
7/28/19
JAVA THE HARD WAY
EXERCISE #36 - Returning a Value from a Function
*/

public class HeronsFormula
{
  public static void main(String[] args)
  {
    double a, g;
    String tws = "A triangle with sides ";

    a = triangleArea(3, 3, 3);
    System.out.println("A triangle wiht sides 3, 3, 3 has an area " + a);

    a = triangleArea(3, 4, 5);
    System.out.println("A triangle wiht sides 3, 4, 5 has an area " + a);
    g = triangleArea(7, 8, 9);
    System.out.println(tws + "7, 8, 9 has area " + g);
    g = triangleArea(9, 9, 9); // study drill 3
    System.out.println(tws + "9, 9, 9 has area " + g);

    System.out.println(tws + "5, 12, 13 has area " + triangleArea(5, 12, 13));
    System.out.println(tws + "10, 9, 11 has area " + triangleArea(10, 9, 11));
    System.out.println(tws + "8, 15, 17 has area " + triangleArea(8, 15, 17));

  }

  public static double triangleArea( int a, int b, int c)
  {
    double s, A;

    s = (a + b + c) / 2.0; //study drill 2
    A = Math.sqrt(s * (s - a) * (s - b) * (s - c));

    return A;
  }
}


//study drill 1: the code without the function is longer
