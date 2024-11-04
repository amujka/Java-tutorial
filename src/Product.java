import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    private final String name;
    private final BigDecimal price;
    private BigDecimal discount;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount.divide(BigDecimal.valueOf(100), RoundingMode.HALF_EVEN);
    }

    public BigDecimal calculatePriceAfterDiscount() {
        return this.price.subtract(this.price.multiply(this.discount));
    }

    public String printProductInfo() {
        return "product:" + this.name + ", price: $" + this.price + ", after discount: $" + this.calculatePriceAfterDiscount();
    }
}
