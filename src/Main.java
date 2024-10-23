import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numberList = new ArrayList<>();
        int number;

        do {
            System.out.println("Please enter number or 0 for exit");
            number = scanner.nextInt();
            if (number != 0) {
                numberList.add(number);
            }
        }while (number != 0);

        System.out.println( calcAvg(numberList));
    }

    static float calcAvg(ArrayList<Integer> list){
        int minNumber = list.get(0);
        int maxNumber = list.get(0);
        int sum = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < minNumber){
                minNumber = list.get(i);
            }else if (list.get(i) > maxNumber) {
                maxNumber = list.get(i);
            }
        }
        System.out.println(list);
        list.remove(list.indexOf(minNumber));
        list.remove(list.indexOf(maxNumber));
        System.out.println(list);

        for(int x : list){
            sum += x;
        }

        return (float) sum / list.size();
    }

}
