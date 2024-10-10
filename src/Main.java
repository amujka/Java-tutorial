import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNum = random.nextInt(3);
        int guessNum;
        do {
            System.out.println("Please guess the number");
            guessNum = scanner.nextInt();
            if (randomNum != guessNum) System.out.println("Please try again");

        } while (randomNum != guessNum);
        System.out.println("Success!!! You guessed correct: " + randomNum);
    }
}
