/*
TRAVIS DUPLANTIS
8/22/19
JAVA THE HARD WAY
EXERCISE #50 - SAYING SOMETHING IS NOT IN AN ARRAY
*/
import java.util.Scanner;

public class ItemNotFound
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    String[] heroes = {"Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon", "Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes", "Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason", "Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus", "Jason" }; //Study drill 1 - add a duplicate name
    String guess;
    boolean found;
    int numCorrect = 0; //Study Drill 1 - add a count variable

    System.out.println("Pop Quiz!");
    System.out.print("Name any *mortal* hero from Greek mythology: ");
    guess = keyboard.next();

    found = false;
    for(String hero : heroes)
    {
      if(guess.equals(hero))
      {
        System.out.println("That's one of them!");
        found = true;
      }
    }

    if(found == false)
    {
      System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
    }

    //study drill 1
    for(String h : heroes)
    {
      if(guess.equals(h))
      {
        numCorrect ++;
      }
    }

    System.out.println("You guessed " + numCorrect + " correctly!"); //study drill 1

  }
}
