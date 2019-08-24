/*
TRAVIS DUPLANTIS
8/22/19
JAVA THE HARD WAY
EXERCISE #56 - ARRAY OF RECORDS FROM A FILE(TEMPERATURES REVISITED)
*/
import java.util.Scanner;

class TemperatureSample
{
  int month, day, year;
  double temperature;
}

public class TemperaturesByDate
{
  public static void main(String[] args) throws Exception
  {
    //study drill 1
    String site = "http://academic.udayton.edu/kissock/http/Weather/gsod95-current";
    String path = "/CODENVER.txt";
    Scanner inFile = new Scanner((new java.net.URL(site + path)).openStream());

    TemperatureSample[] tempDB = new TemperatureSample[10000];
    int numRecords, i = 0;

    while(inFile.hasNextInt() && i < tempDB.length)
    {
      TemperatureSample e = new TemperatureSample();
      e.month = inFile.nextInt();
      e.day = inFile.nextInt();
      e.year = inFile.nextInt();
      e.temperature = inFile.nextDouble();

      if(e.temperature != -99)
      {
        tempDB[i] = e;
        i++;
      }
    }

    inFile.close();
    numRecords = i;

    System.out.println(numRecords + " daily temperatures loaded.");

    double total = 0, avg;
    int count = 0;
    for(i = 0; i < numRecords; i++)
    {
      if(tempDB[i].month == 11)
      {
        total += tempDB[i].temperature;
        count++;
      }
    }

    avg = total / count;
    avg = roundToOneDecimal(avg);
    System.out.print("Average daily temperature over " + count);
    System.out.println(" days in November: " + avg);

    //study drill 2 - find lowest temperature on record
    double low = 9999;
    int month = 0;
    int day = 0;
    int year = 0;
    for(i = 0; i < numRecords; i++)
    {
      if(tempDB[i].temperature < low)
      {
        low = tempDB[i].temperature;
        month = tempDB[i].month;
        day = tempDB[i].day;
        year = tempDB[i].year;
      }
    }
    System.out.println("The lowest temperature on record occurred on " + month + "/" + day + "/" + year + " and was " + low + " degrees");

    //study drill 3
    TemperatureSample t = tempDB[99];
    System.out.println(t);
  }

  public static double roundToOneDecimal(double d)
  {
    return Math.round(d * 10) / 10.0;
  }
}
