public class Article {

    private final String name;
    private final double price;
    private final int quantity;

    public Article(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return name + " - Price: $" + price + ", Quantity: " + quantity;
    }
}
