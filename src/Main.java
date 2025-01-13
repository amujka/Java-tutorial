import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, List<String>> articlesByCategory = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select 1.Add category 2.Add article to category 3.Print category 4.Print All 0. Exit");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    addCategory(scanner, articlesByCategory);
                    break;
                case "2":
                    addArticlesByCategory(scanner, articlesByCategory);
                    break;
                case "3":
                    printOneCategoryContent(scanner, articlesByCategory);
                    break;
                case "4":
                    printAll(articlesByCategory);
                    break;
                case "0":
                    System.out.println("Exiting the program.");
                    return;
            }

        }

        /*
        Napišite program koji simulira sustav za upravljanje proizvodima:
        Koristi HashMap gdje je ključ ime kategorije (npr. "Voće", "Povrće"), a vrijednost je Lista proizvoda u toj kategoriji.
        Dodaje proizvode u kategorije (npr. "Jabuka" u "Voće").
        Omogućuje prikaz svih proizvoda unutar određene kategorije.
        Prikazuje sve kategorije i proizvode u njima.
        */

    }


    static void printAll(HashMap<String, List<String>> articlesByCategory) {
        articlesByCategory.forEach((category, articlesList) -> {
            System.out.println(category + ":" + articlesList);
        });
    }

    static void printOneCategoryContent(Scanner scanner, HashMap<String, List<String>> articlesByCategory) {
        System.out.println("Enter category name");
        String category = scanner.nextLine();
        List<String> list = articlesByCategory.get(category);
        System.out.println("All articles in category " + category);
        System.out.println(list);
    }

    static void addCategory(Scanner scanner, HashMap<String, List<String>> articlesByCategory) {
        String category;
        while (true) {
            System.out.println("Add new category or enter 0 to exit");
            category = scanner.nextLine();
            if (category.equals("0")) break;
            if (!articlesByCategory.containsKey(category)) {
                articlesByCategory.put(category, new ArrayList<>());
            } else {
                System.out.println("Category already exists");
            }
        }
    }

    static void addArticlesByCategory(Scanner scanner, HashMap<String, List<String>> articlesByCategory) {
        System.out.println("Enter category:");
        String selectedCategory = scanner.nextLine();
        List<String> articleList = articlesByCategory.get(selectedCategory);

        while (true) {
            System.out.println("Add article to list " + selectedCategory + " or enter 0 to exit");
            String article = scanner.nextLine();
            if (article.equals("0")) break;
            articleList.add(article);
        }
    }
}
