/*
TRAVIS DUPLANTIS
8/19/19
JAVA THE HARD WAY
EXERCISE #48 - ARRAYS: MANY VALUES IN A SINGLE VARIABLE
*/
public class ArrayIntro
{
  public static void main(String[] args)
  {
    String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

    //for each loop
    //READ AS: "For each String p in the Array planets, do this..."
    for(String p : planets)
    {
      System.out.println(p + "\t" + p.toUpperCase());
    }

    //STUDY DRILL 1
    System.out.println();
    String[] planetTypes = {"Rocky", "Gaseous", "Ice"};

    for(String pt : planetTypes)
    {
      System.out.println(pt + "\t" + pt.toUpperCase());
    }
  }
}
