import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;

        System.out.println("Please enter number:");
        num = scanner.nextInt();
        while (num != 0){
            sum+=num;
            System.out.println("Please enter number:");
            num = scanner.nextInt();
        }
        System.out.println("sum is :"+ sum);
    }
}
