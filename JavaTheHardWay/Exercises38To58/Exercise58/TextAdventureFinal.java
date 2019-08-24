/*
TRAVIS DUPLANTIS
8/22/19
JAVA THE HARD WAY
EXERCISE #58 - TEXT ADVENTURE GAME
*/

import java.util.Scanner;

class Room
{
  int roomNumber;
  String roomName;
  String description;
  int numExits;
  String[] exits = new String[10];
  int[] destinations = new int[10];
}

public class TextAdventureFinal
{
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    //initialize rooms from file
    Room[] rooms = loadRoomsFromFile("text-adventure-rooms.txt");

    //showAllRooms(rooms); //to debug

    //play the GAME
    int currentRoom = 0;
    String ans;
    while(currentRoom >= 0)
    {
      Room cur = rooms[currentRoom];
      System.out.print(cur.description);
      System.out.print("> ");
      ans = keyboard.nextLine();

      //see if what they typed matches any of our exit names
      boolean found = false;
      for(int i = 0; i < cur.numExits; i++)
      {
        if(cur.exits[i].equals(ans))
        {
          currentRoom = cur.destinations[i];
          found = true;
        }
      }
      if(!found)
      {
        System.out.println("Sorry, I don't understand.");
      }
    }
  }

  public static Room[] loadRoomsFromFile(String filename)
  {
    Scanner file = null;
    try
    {
      file = new Scanner(new java.io.File(filename));
    }
    catch(java.io.IOException e)
    {
      System.err.println("Can't open '" + filename + "' for reading.");
      System.exit(1);
    }

    int numRooms = file.nextInt();
    Room[] rooms = new Room[numRooms];

    //initialize rooms from file
    int roomNum = 0;
    while(file.hasNext())
    {
      Room r = getRoom(file);

      if(r.roomNumber != roomNum)
      {
        System.err.print("Just read # " + r.roomNumber);
        System.err.println(", but " + roomNum + " was expected");
        System.exit(2);
      }
      rooms[roomNum] = r;
      roomNum++;
    }

    file.close();

    return rooms;
  }

  public static void showAllRooms(Room[] rooms)
  {
    for(Room r : rooms)
    {
      String exitString = "";
      for(int i = 0; i < r.numExits; i++)
      {
        exitString += "\t" + r.exits[i] + " (" + r.destinations[i] + ")";
      }
      System.out.println(r.roomNumber + ") " + r.roomName);
      System.out.println(exitString);
    }
  }

  public static Room getRoom(Scanner f)
  {
    //any rooms left in the file?
    if(!f.hasNextInt())
    {
      return null;
    }

    Room r = new Room();
    String line;

    //read in room # for error-checking later
    r.roomNumber = f.nextInt();
    f.nextLine(); //skip "\n" after room roomNumber

    r.roomName = f.nextLine();

    //read in room's description
    r.description = "";
    while(true)
    {
      line = f.nextLine();
      if(line.equals("%%"))
      {
        break;
      }
      r.description += line + "\n";
    }

    //finally we'll read in the exits
    int i = 0;
    while(true)
    {
      line = f.nextLine();
      if(line.equals("%%"))
      {
        break;
      }
      String[] parts = line.split(":");
      r.exits[i] = parts[0];
      r.destinations[i] = Integer.parseInt(parts[1]);
      i++;
    }
    r.numExits = i;

    //should be done - return the room
    return r;
  }
}
