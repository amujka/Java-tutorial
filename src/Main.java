import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            calculateAndPrintFactorial();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void calculateAndPrintFactorial() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter number: ");

        do {
            try {
                if (!scanner.hasNextInt()) throw new Exception("Must be integer. Please enter again:");
                number = scanner.nextInt();
                if (number < 0) throw new Exception("Number must positive. Please enter again:");

                long product = 1;
                for (int i = 1; i <= number; i++) {
                    product *= i;
                }
                System.out.printf("Factorial of %d! is %d", number, product);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        } while (true);
    }
}
