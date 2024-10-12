import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Zadatak 2: Brojanje znamenki broja

        int num = scanner.nextInt();
        int numTemp = num;
        int digitCount = 0;

        while (num > 0){
            num = num /10;
            digitCount++;
        }

        System.out.println(numTemp + " has " + digitCount + " digits");
    }
}
