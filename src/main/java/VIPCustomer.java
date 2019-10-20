public class VIPCustomer extends BankAccount {
    private String customerName2;
    private String customerName3;
    private int creditLIMIT;


    public VIPCustomer(int number, double balance, String customerName,
                       String customerEmail, String phoneNr, String customerName2,
                       String customerName3, int creditLIMIT) {
        super(number, balance, customerName,
                customerEmail, phoneNr);
        this.customerName2 = customerName2;
        this.customerName3 = customerName3;
        this.creditLIMIT = creditLIMIT;
    }
}
