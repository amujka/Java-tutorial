import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first integer");
        int numOne = sc.nextInt();

        System.out.println("Please enter second integer");
        int numTwo = sc.nextInt();

        int result = numOne * numTwo;

        System.out.println(numOne + " * " + numTwo + " = " + result);
    }
}
