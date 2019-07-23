import static java.lang.System.*;
import java.util.Scanner;

public class CollegeAdmission
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int math;

    out.println("Welcome to the UT Austin College Admissions Interface!");
    out.print("Please enter yoru SAT math score (200-800): ");
    math = keyboard.nextInt();

    out.print("Admittance status: ");

    //original code
    if(math >= 790)
      out.print("CERTAIN ");
    else if(math >= 710)
      out.print("SAFE ");
    else if(math >= 580)
      out.print("PROBABLE ");
    else if(math >= 500)
      out.print("UNCERTAIN ");
    else if(math >= 390)
      out.print("UNLIKELY ");
    else
      out.print("DENIED ");

    /* Drill 1
    if(math >= 790)
      out.print("CERTAIN ");
    if(math >= 710)
      out.print("SAFE ");
    if(math >= 580)
      out.print("PROBABLE ");
    if(math >= 500)
      out.print("UNCERTAIN ");
    if(math >= 390)
      out.print("UNLIKELY ");
    else
      out.print("DENIED ");
    */

    /* Drill 2
    if(math >= 790)
      out.print("CERTAIN ");
    else if(math >= 390)
      out.print("UNLIKELY ");
    else if(math >= 710)
      out.print("SAFE ");
    else if(math >= 580)
      out.print("PROBABLE ");
    else if(math >= 500)
      out.print("UNCERTAIN ");
    else
      out.print("DENIED ");
    */

    //Drill 3 - no thanks - i believe you

    out.println();
  }
}
