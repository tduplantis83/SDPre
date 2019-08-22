/*
TRAVIS DUPLANTIS
8/19/19
JAVA THE HARD WAY
EXERCISE #45 - LOOPING THROUGH A STRING
*/
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CaesarCipher
{
  /**
    * Returns the character shifted by the given number of letters.
    */
    public static char shiftLetter(char c, int n)
    {
      int u = c;

      if( !Character.isLetter(c))
      {
        return c;
      }

      u = u + n;
      if(Character.isUpperCase(c) && u > 'Z' || Character.isLowerCase(c) && u > 'z')
      {
        u -= 26;
      }
      if(Character.isUpperCase(c) && u < 'A' || Character.isLowerCase(c) && u < 'a')
      {
        u += 26;
      }

      return(char)u;
    }

  public static void main(String[] args) throws Exception
  {
    Scanner keyboard = new Scanner(System.in);
    String plaintext, cipher = "", saveFileName = "message-and-cipher.txt";
    int shift;
    File f = new File(saveFileName);

    if(f.exists() && f.length() > 0)
    {
      Scanner fileInput = new Scanner(f);
      plaintext = fileInput.nextLine();
      shift = fileInput.nextInt();

      fileInput.close();
    }
    else
    {
      System.out.print("Message: ");
      plaintext = keyboard.nextLine();
      System.out.print("Shift (0-26): ");
      shift = keyboard.nextInt();
    }

    for(int i = 0; i < plaintext.length(); i++)
    {
      cipher += shiftLetter(plaintext.charAt(i), shift);
    }

    System.out.println("Original message, shift, and resulting cipher have been saved to the 'message-and-cipher.txt' file.");
    PrintWriter out = new PrintWriter(f);
    out.println(plaintext);
    out.println(shift);
    out.println(cipher);

    out.close();
  }
}
