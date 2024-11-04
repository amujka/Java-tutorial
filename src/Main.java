import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        createProductArray();
    }

    private static void createProductArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many products you want to create");
        int arrayLength = scanner.nextInt();
        Product[] products = new Product[arrayLength];

        scanner.nextLine();
        for (int i = 0; i < products.length; i++) {
            System.out.printf("Enter %d. product name: ", (i + 1));
            String productName = scanner.nextLine();
            System.out.printf("Enter %d. product price: ", (i + 1));
            BigDecimal price = BigDecimal.valueOf(scanner.nextInt());
            products[i] = new Product(productName, price);
            System.out.println("Set discount (integer):");
            products[i].setDiscount(BigDecimal.valueOf(scanner.nextDouble()));
            scanner.nextLine();
        }

        for (Product product : products) {
            System.out.println(product.printProductInfo());
        }

    }

}
