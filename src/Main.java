import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        int number;

        do {
            System.out.println("Enter number or 0 to exit" );
            number = scanner.nextInt();
            if (number != 0){
                numberList.add(number);
            }
        } while (number != 0);

        boolean isSorted = checkOrder(numberList);
        if (isSorted){
            System.out.println("List is sorted");
        }else {
            System.out.println("List is not sorted");
        }
    }

    static boolean checkOrder(ArrayList<Integer> list){
        int lastIndex = list.indexOf(list.size()-1);
        for (int i = 0; i < list.size(); i++) {
            if (i < lastIndex && list.get(i) > list.get(i+1)){
                return false;
            }
        }
        return true;
    }

}
