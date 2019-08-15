/*
TRAVIS DUPLANTIS
8/15/19
OBJECTIVE 3, LAB 3 - CALCULATE BIRTH YEAR
*/

import java.util.Scanner;
import java.time.Year;

public class Objective3Lab3
{
  public static void main(String[] args)
  {
    int birthYear, age, currentYear;
    Scanner input = new Scanner(System.in);

    birthYear = 0;

    System.out.println("How old are you?");
    age = input.nextInt();

    currentYear = Year.now().getValue();

    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);

    input.close();

  }
}
