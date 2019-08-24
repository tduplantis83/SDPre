/*
TRAVIS DUPLANTIS
8/22/19
JAVA THE HARD WAY
EXERCISE #57 - A DECK OF PLAYING CARDS
*/

class Card
{
  int value;
  String suit;
  String name;

  public String toString()
  {
    return name + " of " + suit;
  }
}

public class PickACard
{
  public static void main(String[] args)
  {
    Card[] deck = buildDeck();
    System.out.println("Here's your deck of cards in order:");
    displayDeck(deck);

    int chosen = (int)(Math.random()*deck.length);
    Card picked = deck[chosen];

    System.out.println("\nYou picked a " + picked + " out of the deck,");
    System.out.println(" worth " + picked.value + " points in Blackjack.\n");

    shuffleDeck(deck);
    System.out.println("Here's your deck of cards SHUFFLED:");
    displayDeck(deck);

  }

  public static Card[] buildDeck()
  {
    String [] suits = {"clubs", "diamonds", "hearts", "spades"};
    String [] names = {"ZERO", "ONE", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "Jack", "Queen", "King", "Ace"};

    int i = 0;
    Card[] deck = new Card[52];

    for(String s : suits)
    {
      for(int v = 2; v <= 14; v++)
      {
        Card c = new Card();
        c.suit = s;
        c.name = names[v];
        if(v == 14)
        {
          c.value = 11;
        }
        else if(v > 10)
        {
          c.value = 10;
        }
        else
        {
          c.value = v;
        }

        deck[i] = c;
        i++;
      }
    }

    return deck;
  }

  public static void displayDeck(Card[] deck)
  {
    for(Card c : deck)
    {
      System.out.println(c.value + "\t" + c);
    }
  }

  //study drill 1 - create a method to shuffle the deck
  public static void shuffleDeck(Card[] d)
  {
    int random1 = 0;
    int random2 = 0;
    int v = 0;
    String name;
    String suit;

    //loop through the deck 10,000,000 times to shuffle it
    for(int i = 0; i < 10000000; i++)
    {
      //pick two random index numbers to swap
      random1 = (int)(Math.random()*d.length);
      random2 = (int)(Math.random()*d.length);

      //if the random numbers are equal, change one of them
      while(random1 == random2)
      {
        random1 = (int)(Math.random()*d.length);
      }

      //temporarily hold the values from index1
      v = d[random1].value;
      name = d[random1].name;
      suit = d[random1].suit;

      //copy the values from index2 into index1
      d[random1].value = d[random2].value;
      d[random1].name = d[random2].name;
      d[random1].suit = d[random2].suit;

      //copy the values that were in index1 into index2
      d[random2].value = v;
      d[random2].name = name;
      d[random2].suit = suit;
    }

  }
}
