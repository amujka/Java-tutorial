public class Cash extends PaymentMethod {
    
    @Override
    public void pay(double amount) {
        super.setAmount(super.getAmount() + amount);
    }

    @Override
    public String getDetails() {
        return "Plaćanje u gotovini u iznosu od:" + super.getAmount() + " EUR.";
    }

    @Override
    public double returnAmount() {
        return getAmount();
    }
}
