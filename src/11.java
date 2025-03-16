import java.util.*;

public class MathHomework {
  public static void main(String[] args) {
    // Generate a random number between 1 and 100
    int randNum = (int)(Math.random() * 100) + 1;

    // Ask the user to guess the number
    System.out.print("Guess a number between 1 and 100: ");
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();

    // Check if the user's input is equal to the random number
    if (userInput == randNum) {
      System.out.println("You guessed it! The number was " + randNum + ".");
    } else {
      System.out.println("Sorry, you didn't get it right. The number was " + randNum + ".");
    }
  }
}
