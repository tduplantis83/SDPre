import java.util.Scanner;

public class RudeQuestions
{
  public static void main(String[] args)
  {
    String name, calories;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "lbs! Better keep that quiet!!");
    System.out.print("How many calories do you eat per day? ");
    calories = keyboard.next();
    System.out.println(calories + "! Holy cow! No wonder you're " + weight + "lbs!");

    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is $" + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ".");
  }
}

/*STUDY DRILLS
1. No the program does NOT blow up if you input an Integer when it's expecting a Double. My guess is that JAVA simply assumes there is a .0 after the Integer you enter.
2. No the program does NOT blow up if you input an Int or Double when it expects a String. My guess is that it takes the given Int or Double and makes it into a String - you just wouldn't be able to do math on it.
3a. I couldn't get the program to blow up on the first question, because whatever I give it was converted into a String.
3b. The second question can be screwed up by entering a Double, or a String because those aren't Integers.
3c. The third question can be blown up by entering a String because it can't be used as a double.
3d. The fourth question can also be blown up by entering a String because it can't be used as a double.
4.
*/
