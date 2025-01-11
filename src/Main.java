import java.util.*;

public class Main {

    public static void main(String[] args) {
        //wordCounter();
        printUniqueNumbers();
        /*
        Zadatak 2: Popis jedinstvenih vrijednosti koristeći Set
        Napišite program koji:
        Od korisnika traži unos brojeva (razdvojenih razmakom).
        Koristi HashSet za izdvajanje samo jedinstvenih brojeva (bez ponavljanja).
        Ispisuje sve jedinstvene brojeve.
        Traži najveći i najmanji broj koristeći odgovarajuće metode skupa.
        */
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

    static void printUniqueNumbers() {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numbers:");
        String text = scanner.nextLine();
        String[] numbersArray = text.split(" ");
        for (String num : numbersArray) {
            uniqueNumbers.add(Integer.parseInt(num));
        }

        System.out.println(uniqueNumbers);

        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for (int number : uniqueNumbers) {
            if (number < minNum) {
                minNum = number;
            }
            if (number > maxNum) {
                maxNum = number;
            }
        }

        System.out.println("Smallest number: " + Collections.min(uniqueNumbers));
        System.out.println("Biggest number: " + Collections.max(uniqueNumbers));
    }
}
