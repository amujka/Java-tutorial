import java.math.BigDecimal;
import java.math.RoundingMode;

public class CheckingsAccount extends Account {
    public CheckingsAccount(String accountNumber, String owner, BigDecimal amount) {
        super(accountNumber, owner, amount);
    }

    @Override
    public void calculateAndPrintInterestAndAmount() {
        BigDecimal interest = super.getAmount().multiply(BigDecimal.valueOf(0.001));
        super.setAmount(super.getAmount().add(interest));

        //Zaokruzio iznose na jednu decimalu umjesto defaultni 3
        BigDecimal formatedInterest = interest.setScale(1, RoundingMode.CEILING);
        BigDecimal formatedAmount = super.getAmount().setScale(1, RoundingMode.CEILING);

        System.out.println(super.getOwner() + ":" + super.getAccountNumber() + "\nCurrent interest is : $" + formatedInterest + ", current amount is: $" + formatedAmount + "\n");
    }
}