import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        1. Zadatak – Zamjena najmanjeg i najvećeg broja u List-i

//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> numbersList = new ArrayList<>();
//        int number;
//
//        do {
//            System.out.println("Please enter integer or 0 for exit");
//            number = scanner.nextInt();
//            if (number != 0) {
//                numbersList.add(number);
//            }
//        }while (number != 0);
//
//        System.out.println("Numbers in a numbersList are:" + numbersList);
//
//        int minNumber = numbersList.get(0);
//        int maxNumber = numbersList.get(0);
//        for (int i = 1; i < numbersList.size(); i++) {
//            if (numbersList.get(i) < minNumber){
//                minNumber = numbersList.get(i);
//            }else if (numbersList.get(i) > maxNumber) {
//                maxNumber = numbersList.get(i);
//            }
//        }
//        System.out.println("MIN: " + minNumber + ", MAX: " + maxNumber);
//
//        int indexOfMin = numbersList.indexOf(minNumber);
//        int indexOfMax = numbersList.indexOf(maxNumber);
//
//        numbersList.set(indexOfMin, maxNumber);
//        numbersList.set(indexOfMax, minNumber);
//
//        System.out.println(numbersList);

//        2. Zadatak. Od korisnika trazite unos 10 brojeva te u listi pronadite koji broj se najvise puta ponavlja.

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Please enter %d. number:\n", (i + 1));
            numbersList.add(scanner.nextInt());
        }

        System.out.println(numbersList);
        int counter = 0;
        int counter2 = 0;
        int mostNumber = 0;

        for (int i = 0; i < numbersList.size(); i++) {
            for (int j = 0; j < numbersList.size(); j++) {
                if (numbersList.get(i).equals(numbersList.get(j))){
                    counter ++;
                }
            }
            if (counter > counter2){
                counter2 = counter;
                mostNumber = numbersList.get(i);
            }
            counter = 0;
        }
        if (counter2 != 1){
            System.out.println("The most repeated number is " + mostNumber + ", " + counter2 + "x");
        }else {
            System.out.println("Every number was different");
        }

    }
}
