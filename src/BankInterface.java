public interface BankInterface {
    int getBalance();
    String depositeMoney(int money);
    String withdraw(int amount, String password);
    double calculateInterest(int time);
}
