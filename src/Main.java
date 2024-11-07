import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        SavingsAccount savingsAccount1 = new SavingsAccount("123456789", "Alen Mujkanovic", BigDecimal.valueOf(1500));
        savingsAccount1.deposit(BigDecimal.valueOf(500));
        savingsAccount1.calculateAndPrintInterestAndAmount();

        CheckingsAccount checkingAccount1 = new CheckingsAccount("987654321", "Pero Peric", BigDecimal.valueOf(1000));
        checkingAccount1.withdraw(BigDecimal.valueOf(100));
        checkingAccount1.calculateAndPrintInterestAndAmount();

        CheckingsAccount checkingAccount2 = new CheckingsAccount("123498765", "Ana Anic", BigDecimal.valueOf(50));
        checkingAccount2.deposit(BigDecimal.valueOf(5));
        checkingAccount2.calculateAndPrintInterestAndAmount();
    }

}
