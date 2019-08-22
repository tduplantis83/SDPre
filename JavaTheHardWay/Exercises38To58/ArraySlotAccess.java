/*
TRAVIS DUPLANTIS
8/22/19
JAVA THE HARD WAY
EXERCISE #51 - SARRAYS WITHOUT FOR EACH LOOPS
*/

public class ArraySlotAccess
{
  public static void main(String[] args)
  {
    int[] arr = new int[1000];

    //We almost always use a for loop to access each slot of an array.
    //fill the array
    for(int i = 0; i < arr.length; i++)
    {
      arr[i] = 1 + (int)(Math.random()*100);
    }

    //Display all values in the array
    System.out.print("Values: ");
    for(int i = 0; i < arr.length; i++)
    {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    ////////////////////////////////////////
    //Broken down by step...
    //Put a number into each slot of the array, one at a time.
    arr[0] = 6;
    arr[1] = 7;
    arr[2] = 8;

    //display the values in those slots, one at a time.
    System.out.println("Values: " + arr[0] + " " + arr[1] + " " + arr[2]);

    ///////////////////////////////////////
    //put a random number from 1-100 into each slot of the array, one at a time.
    arr[0] = 1 + (int)(Math.random()*100);
    arr[1] = 1 + (int)(Math.random()*100);
    arr[2] = 1 + (int)(Math.random()*100);

    //display again one at a time
    System.out.println("Values: " + arr[0] + " " + arr[1] + " " + arr[2]);

    //////////////////////////////////////
    int m = 0;
    arr[m] = 1 + (int)(Math.random()*100);
    m = 1;
    arr[m] = 1 + (int)(Math.random()*100);
    m = 2;
    arr[m] = 1 + (int)(Math.random()*100);

    //display again
    System.out.print("Values: ");
    m = 0;
    System.out.print(arr[m] + " ");
    m = 1;
    System.out.print(arr[m] + " ");
    m = 2;
    System.out.print(arr[m] + " ");
    System.out.println();

    //////////////////////////////////////
    int n = 0;
    arr[n] = 1 + (int)(Math.random()*100);
    n++;
    arr[n] = 1 + (int)(Math.random()*100);
    n++;
    arr[n] = 1 + (int)(Math.random()*100);

    //display again
    System.out.print("Values: ");
    n = 0;
    System.out.print(arr[m] + " ");
    n++;
    System.out.print(arr[m] + " ");
    n++;
    System.out.print(arr[m] + " ");
    System.out.println();

    //for loop again...
    for(int q = 0; q < arr.length; q++)
    {
      System.out.print(arr[q] + " ");
    }

    System.out.println();

  }
}
