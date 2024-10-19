import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        1. Zadatak – Zamjena najmanjeg i najvećeg broja u List-i

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();
        int number;

        do {
            System.out.println("Please enter integer or 0 for exit");
            number = scanner.nextInt();
            if (number != 0) {
                numbersList.add(number);
            }
        }while (number != 0);

        System.out.println("Numbers in a numbersList are:" + numbersList);

        int minNumber = numbersList.get(0);
        int maxNumber = numbersList.get(0);
        for (int i = 1; i < numbersList.size(); i++) {
            if (numbersList.get(i) < minNumber){
                minNumber = numbersList.get(i);
            }else if (numbersList.get(i) > maxNumber) {
                maxNumber = numbersList.get(i);
            }
        }
        System.out.println("MIN: " + minNumber + ", MAX: " + maxNumber);

        int indexOfMin = numbersList.indexOf(minNumber);
        int indexOfMax = numbersList.indexOf(maxNumber);

        numbersList.set(indexOfMin, maxNumber);
        numbersList.set(indexOfMax, minNumber);

        System.out.println(numbersList);
    }
}
