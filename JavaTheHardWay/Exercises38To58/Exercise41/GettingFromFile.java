/*
TRAVIS DUPLANTIS
8/16/19
JAVA THE HARD WAY
EXERCISE #41 - GETTING DATA FROM A FILE
*/

import java.io.File;
import java.util.Scanner;

public class GettingFromFile
{
  public static void main(String[] args) throws Exception
  {
    String name;
    int a, b, c, sum;

    System.out.print("Getting name and three numbers from a file...");
    Scanner fileIn = new Scanner(new File("name-and-numbers.txt"));

    name = fileIn.nextLine();
    a = fileIn.nextInt();
    b = fileIn.nextInt();
    c = fileIn.nextInt();

    fileIn.close();

    System.out.println("done.");
    System.out.println("Your name is " + name);
    sum = a + b + c;
    System.out.println(a + " + " + b + " + " + c + " = " + sum);
  }
}
