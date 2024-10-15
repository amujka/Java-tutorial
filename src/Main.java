import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter array length:");
        int arrayLength = scanner.nextInt();
        int [] numArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("Enter %d. number: ", i + 1);
            numArray[i]= scanner.nextInt();
        }

        int biggerNum = 0;
        for (int x : numArray){
            if (x > biggerNum) {
                biggerNum = x;
            }
        }
        System.out.println("Biggest num in the array is " + biggerNum);
    }
}
