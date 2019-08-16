/*
TRAVIS DUPLANTIS
8/16/19
JAVA THE HARD WAY
EXERCISE #40 - PROGRAMS THAT WRITE TO FILES
*/

import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReceiptRevisited
{
  public static void main(String[] args)
  {
    PrintWriter fileout;
    Scanner s = new Scanner(System.in);
    double price = 3.13;
    double gallons = 0;
    double total;

    System.out.println("Gas costs $ " + price + " per gallon.");
    System.out.print("How many gallons do you want? ");
    gallons = s.nextDouble();
    total = price * gallons;
    System.out.println("\nTotal Cost: $ " + total);

    try
    {
      fileout = new PrintWriter("receipt.txt");
    }
    catch(IOException err)
    {
      System.out.println("Sorry, I can't open 'receipt.txt' for writing.");
      System.out.println("Maybe the file already exists and is read-only?");
      fileout = null;
      System.exit(1);
    }

    fileout.println("+------------------------+");
    fileout.println("|                        |");
    fileout.println("|      CORNER STORE      |");
    fileout.println("|                        |");
    fileout.println("| 2019-08-16  10:52AM    |");
    fileout.println("|                        |");
    fileout.println("| Gallons:       "+ gallons + "  |");
    fileout.println("| Price/gallon: $ "+ price + "  |");
    fileout.println("|                        |");
    fileout.println("| Fuel total:   $" + total + "  |");
    fileout.println("|                        |");
    fileout.println("+------------------------+");

    System.out.println("Writing customized receipt to 'receipt.txt'...done");
    fileout.close();
  }
}
