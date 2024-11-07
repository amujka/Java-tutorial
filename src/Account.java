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

    public String getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public abstract void calculateAndPrintInterestAndAmount();

    protected void withdraw(BigDecimal amount) {
        this.amount = this.amount.subtract(amount);
    }

    protected void deposit(BigDecimal amount) {
        this.amount = this.amount.add(amount);
    }

}
