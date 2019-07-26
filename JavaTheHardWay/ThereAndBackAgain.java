public class ThereAndBackAgain
{
  public static void main(String[] args)
  {
    System.out.println("Here.");
    erebor();  //study drill 1 - removing () causes program not to compile.
    System.out.println("Back first time.");
    erebor(); //removing the second function call means that "There"  is only printed once
    System.out.println("Back second time.");

  }

  public static void erebor()
  {
    System.out.println("There");
  }
}
