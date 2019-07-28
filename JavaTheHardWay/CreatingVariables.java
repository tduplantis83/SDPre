/*
TRAVIS DUPLANTIS
7/28/19
JAVA THE HARD WAY
EXERCISE #5 - Saving Information in Variables
*/


public class CreatingVariables
{
  public static void main(String[] args)
  {
    int x, y, age, z;
    double seconds, e, checking, savings;
    String firstName, lastName, title, middleName, nickName;

    x = 10;
    y = 400;
    age = 39;
    z = 666;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    savings = 834.78;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    middleName = "Nicholas";
    nickName = "G-Money";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The z variable holds " + z);
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + " in your checking account!");
    System.out.println("Hopefully you have more than $" + savings + " in your savings account!");
    System.out.println("My name's " + title + " " + firstName + " " + middleName + " " + lastName + "; although I usually go by my nick name: " + nickName);

  }
}
