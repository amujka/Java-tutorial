import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Article> articles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        addArticle(scanner, articles);

        System.out.println(articles);
        try {
            writeArticlesToFile(articles);
            writeExpensiveArticlesToFile(articles);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void addArticle(Scanner scanner, ArrayList<Article> articles) {
        do {
            System.out.println("Add article name or enter 0 to exit:");
            String name = scanner.nextLine();
            if (name.equals("0")) break;
            System.out.println("Add article price:");
            double price = scanner.nextDouble();
            System.out.println("Add article quantity:");
            int quantity = scanner.nextInt();
            articles.add(new Article(name, price, quantity));
            scanner.nextLine();
        } while (true);
    }

    static void writeArticlesToFile(ArrayList<Article> articles) throws IOException {
        PrintWriter writer = new PrintWriter("articles.txt");
        writer.printf("%-15s %-10s %-10s%n", "Name", "Price", "Quantity");
        for (Article article : articles) {
            writer.printf("%-15s $%-9.2f %-10d%n", article.getName(), article.getPrice(), article.getQuantity());
        }
        writer.close();
    }

    static void writeExpensiveArticlesToFile(ArrayList<Article> articles) throws IOException {
        PrintWriter writer = new PrintWriter("expensiveArticles.txt");
        writer.printf("%-15s %-10s %-10s%n", "Name", "Price", "Quantity");
        for (Article article : articles) {
            if (article.getPrice() > 50.0) {
                writer.printf("%-15s $%-9.2f %-10d%n", article.getName(), article.getPrice(), article.getQuantity());
            }
        }
        writer.close();
    }

}
