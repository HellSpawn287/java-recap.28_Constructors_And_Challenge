public class BankAccount {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNr;

    public BankAccount() {
        this(777, 50.3, "Default name", "default @com", "0044 -Default ");
        System.out.println("Empty constructor was called");
    }

    public BankAccount(int number, double balance, String customerName, String customerEmail, String phoneNr) {
        System.out.println("BankAccount constructor with parameters was called");
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNr = phoneNr;
        this.number = number;
        this.balance = balance;
    }

    public void depositFunds(int cash) {
        this.balance += cash;
        System.out.println("Deposit of " + cash + " made. New balance is :" + balance);
    }

    public void withDrawalFunds(int cash) {
        if (balance - cash < 0) {
            System.out.println("Only " + balance + " PLN available. Withdrawal not processed");
        } else {
            this.balance -= cash;
            System.out.println("Withdrawal of " + cash + " processed. Remaining balance = " + balance);
        }
    }

    public double getBalance() {
        System.out.println("Account balance is : "+ balance);
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }
}
