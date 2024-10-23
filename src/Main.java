import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1.zadatak
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numberList = new ArrayList<>();
        System.out.println("Please enter how many numbers you want to enter:");
        int listLength = scanner.nextInt();

        for (int i = 0; i < listLength; i++) {
            System.out.printf("Please enter %d. number", i+1);
            numberList.add(scanner.nextInt());
        }

        System.out.println(checkDuplicates(numberList));
    }

    static boolean checkDuplicates(ArrayList<Integer> list){
        boolean hasDuplicate = false;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)){
                    hasDuplicate = true;
                    break;
                }
            }
        }
        return hasDuplicate;
    }

}
