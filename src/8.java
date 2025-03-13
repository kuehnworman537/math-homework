import java.util.Random;
public class MathHomework {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random rand = new Random();
        int num1 = rand.nextInt(100) + 1;

        // Ask the user to guess the number
        System.out.println("Guess the number between 1 and 100: ");

        // Read the user's input
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        // Check if the user's input is correct
        if (guess == num1) {
            System.out.println("Congratulations! You are correct.");
        } else {
            System.out.println("Sorry, you are incorrect. The number was " + num1);
        }
    }
}