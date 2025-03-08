import java.util.Random;
public class MathHomework {
    public static void main(String[] args) {
        Random rand = new Random();
        int number1 = rand.nextInt(20) + 1;
        int number2 = rand.nextInt(20) + 1;
        System.out.println("What is " + number1 + " x " + number2 + "?");
    }
}
