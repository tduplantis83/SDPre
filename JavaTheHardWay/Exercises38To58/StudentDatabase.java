/*
TRAVIS DUPLANTIS
8/22/19
JAVA THE HARD WAY
EXERCISE #55 - AN ARRAY OF RECORDS
*/

class Student
{
  String name;
  int credits;
  double gpa;
}

public class StudentDatabase
{
  public static void main(String[] args)
  {
    Student[] db;
    db = new Student[4];

    db[0] = new Student();
    db[0].name = "Esteban";
    db[0].credits = 43;
    db[0].gpa = 2.9;

    db[1] = new Student();
    db[1].name = "Dave";
    db[1].credits = 15;
    db[1].gpa = 3.9;

    db[2] = new Student();
    db[2].name = "Michelle";
    db[2].credits = 132;
    db[2].gpa = 3.72;

    //study drill 2
    db[3] = new Student();
    db[3].name = "Travis";
    db[3].credits = 132;
    db[3].gpa = 3.99;

    for(int i = 0; i < db.length; i++)
    {
      System.out.println("Name: " + db[i].name);
      System.out.println("\tCredit Hours: " + db[i].credits);
      System.out.println("\tGPA: " + db[i].gpa + "\n");
    }

    int maxLoc = 0;

    for(int i = 1; i < db.length; i++)
    {
      if(db[i].gpa > db[maxLoc].gpa)
      {
        maxLoc = i;
      }
    }

    System.out.println(db[maxLoc].name + " has the highest GPA.");

    //study drill 3
    int lowCredits = 0;

    for(int i = 1; i < db.length; i++)
    {
      if(db[i].credits < db[lowCredits].credits)
      {
        lowCredits = i;
      }
    }

    System.out.println(db[lowCredits].name + " has the fewest credits.");
  }
}
