public class CreditCard extends PaymentMethod {

    @Override
    public void pay(double amount) {
        super.setAmount(super.getAmount() + amount);
    }

    @Override
    public String getDetails() {
        return "Plaćanje putem kreditne kartice u iznosu od:" + super.getAmount() + " EUR.";
    }

    @Override
    public double returnAmount() {
        return getAmount();
    }
}
