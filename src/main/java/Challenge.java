public class Challenge {
    public static void main(String[] args) {
        BankAccount bzwbk = new BankAccount();

        bzwbk.setCustomerName("Robert");
        bzwbk.setNumber(2345);
        bzwbk.getBalance();
        bzwbk.depositFunds(5000);
        System.out.println(bzwbk.getBalance());
        bzwbk.withDrawalFunds(500);
        System.out.println(bzwbk.getBalance());
        bzwbk.depositFunds(5000);
        System.out.println(bzwbk.getBalance());
        bzwbk.withDrawalFunds(19500);
        System.out.println(bzwbk.getBalance());
    }
}
