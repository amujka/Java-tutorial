import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        payment(scanner);

    }

    private static void payment(Scanner scanner) {
        Payment paymentType = null;
        double amount;
        do {
            System.out.println("Please enter amount or 0 to finish");
            amount = scanner.nextDouble();
            if (amount == 0) break;

            System.out.println("Please choose payment method\n1 for cash, 2 for credit card, 3 for PayPal");
            int selectedOption = scanner.nextInt();

            switch (selectedOption) {
                case 1:
                    paymentType = new Cash();
                    break;
                case 2:
                    paymentType = new CreditCard();
                    break;
                case 3:
                    paymentType = new PayPal();
                    break;
            }
            if (paymentType != null) { //da se rijesim null pointer upozorenja
                paymentType.pay(amount);
                System.out.println(paymentType.returnAmount());
                System.out.println(paymentType.getDetails());
            }
        } while (true);
    }

}
