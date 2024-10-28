import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float [] apoeni = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f};
        System.out.println("Please enter a withdraw amount");
        float amount = scanner.nextFloat();
        String result = "";
        int index = 0;

        while (index < apoeni.length){
            if (amount >= (float)apoeni[index]){
                amount -= apoeni[index];
                result = result.concat(apoeni[index] + ", ");
                index = 0;
            }
            index++;
        }
        System.out.println(result);
    }

}
