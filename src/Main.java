import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        wordCounter();
    }

    static void wordCounter() {
        Map<String, Integer> words = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the text:");
        String text = scanner.nextLine();
        String[] textArray = text.split("[\\s\\p{Punct}]+");

        for (String word : textArray) {
            word = word.toLowerCase();
            if (words.containsKey(word)) {
                int count = words.get(word) + 1;
                words.put(word, count);
            } else {
                words.put(word, 1);
            }
        }

        words.forEach((word, count) -> System.out.println(word + " -> " + count));
    }
}
