public interface Payment {
    void pay(double amount);

    String getDetails();

    double returnAmount();
}
