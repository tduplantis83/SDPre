/*
TRAVIS DUPLANTIS
7/28/19
JAVA THE HARD WAY
EXERCISE #25 - Repeating Yourself with the While Loop
*/

import java.util.Scanner;

public class EnterPIN
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String entryPass;
    String password = "Pa$$w0rd";

    pin = 12345;

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.print("ENTER YOUR PASSWORD: ");
    entryPass = keyboard.next();

    while(!entryPass.equals(password))
    {
      System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
      System.out.print("ENTER YOUR PASSWORD: ");
      entryPass = keyboard.next();
    }

    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while(entry != pin)
    {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
