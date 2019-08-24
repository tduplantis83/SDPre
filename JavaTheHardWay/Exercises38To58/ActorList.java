/*
TRAVIS DUPLANTIS
8/22/19
JAVA THE HARD WAY
EXERCISE #54 - RECORDS FROM A FILE
*/

import java.util.Scanner;

class Actor
{
  String name;
  String role;
  String birthDate;
}

public class ActorList
{
  public static void main(String[] args) throws Exception
  {
    String url = "https://learnjavathehardway.org/txt/s01e01-cast.txt";
    //Scanner inFile = new Scanner(new java.io.File("s01e01-cast.txt"));
    Scanner inFile = new Scanner((new java.net.URL(url)).openStream());
    //study drill 1
    int count = 0;

    while(inFile.hasNext())
    {
      Actor a = getActor(inFile);
      System.out.print(a.name + " was born " + a.birthDate);
      System.out.println(" and played " + a.role);
      count ++;
    }
    inFile.close();

    System.out.println(count + " total records were processed.");
  }

  public static Actor getActor(Scanner input)
  {
    Actor a = new Actor();
    a.name = input.nextLine();
    a.role = input.nextLine();
    a.birthDate = input.nextLine();

    return a;
  }
}
