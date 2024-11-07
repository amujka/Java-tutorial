import java.math.BigDecimal;

public abstract class Account {
    private final String accountNumber;
    private final String owner;
    private BigDecimal amount;

    public Account(String accountNumber, String owner, BigDecimal amount) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.amount = amount;
    }

    protected String getOwner() {
        return owner;
    }

    protected String getAccountNumber() {
        return accountNumber;
    }

    protected BigDecimal getAmount() {
        return amount;
    }

    protected void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    protected void withdraw(BigDecimal amount) {
        this.amount = this.amount.subtract(amount);
    }

    protected void deposit(BigDecimal amount) {
        this.amount = this.amount.add(amount);
    }

    protected abstract void calculateAndPrintInterestAndAmount();

}
