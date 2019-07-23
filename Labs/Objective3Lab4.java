import java.util.Scanner;

public class Objective3Lab4
{
  public static void main(String[] args)
  {
    String firstName, lastName;
    int age;

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter your First Name: ");
    firstName = input.next();

    System.out.println("Please enter your Last Name: ");
    lastName = input.next();

    System.out.println("Please enter your Age: ");
    age = input.nextInt();

    System.out.println("First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age);

    input.close();
  }
}
