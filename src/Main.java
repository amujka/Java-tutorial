import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        String operator;

        System.out.println("Please enter first number");
        int firstNum = scanner.nextInt();

        System.out.println("Please enter second number");
        int secondNum = scanner.nextInt();

        System.out.println("Choose number: 1) +, 2) -, 3) *, 4) /");
        int operatorNum = scanner.nextInt();

        if (operatorNum == 1){
            result = firstNum + secondNum;
            operator = "+";
        } else if (operatorNum == 2) {
            result = firstNum - secondNum;
            operator = "-";
        } else if (operatorNum == 3) {
            result = firstNum * secondNum;
            operator = "*";
        } else {
            result = firstNum / secondNum;
            operator = "/";
        }

        System.out.printf("%d %s %d = %d",firstNum,operator,secondNum,result);
    }
}
