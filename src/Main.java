import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //1. zadatak

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write something");
        String [] wordArray =  scanner.nextLine().split(" ");

        findLongerWords(wordArray);
        findLongestWord(wordArray);
        stringAverageLength(wordArray);
    }

    static void findLongerWords(String[] wordArray){
        String longerWords = "";
        for (String word : wordArray) {
            if (word.length() > 5){
                longerWords = longerWords.concat(word + " ");
            }
        }
        if (longerWords.isEmpty()){
            System.out.println("No words longer than 5");
        }else {
            System.out.println("Words longer than 5 letters: " + longerWords.toUpperCase());
        }
    }

    static void findLongestWord(String[] wordArray){
        String longestWord = "";
        for (String word : wordArray) {
            if (word.length() > longestWord.length()){
               longestWord = word;
            }
        }
        System.out.println("First longest word: " + longestWord.toUpperCase());
    }

    static void stringAverageLength(String[] wordArray){
        int lettersSum = 0;
        for (String word : wordArray){
            lettersSum += word.length();
        }
        float wordAvg = (float)lettersSum / wordArray.length;
        System.out.println("Word average length is: " + wordAvg);
    }
}
