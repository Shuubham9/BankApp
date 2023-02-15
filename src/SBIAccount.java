import java.util.UUID;

public class SBIAccount implements BankInterface{
    private String name;
    private String accNo;
    private int balance;
    private String password;
    private double rateOfInterest;

    public SBIAccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateOfInterest=6.6;
        this.accNo=String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositeMoney(int money) {
        this.balance+=money;
        return "Paisa jama hogaya "+money;
    }

    @Override
    public String withdraw(int amount, String password) {
        String withdrawn;
        if(password.equals(this.password)){
            if(this.balance<amount){
              return "insuffient balance";}
            else{
                withdrawn=Integer.toString(balance-amount);
            }
        }
        else{
            return "wrong password bro";
        }
        return withdrawn;
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*rateOfInterest*time)/100.0;
    }
}
