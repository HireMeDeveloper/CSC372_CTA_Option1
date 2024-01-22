public class CheckingAccount extends BankAccount{
    protected double interestRate;
    public CheckingAccount(String firstName, String lastName, int accountID, double balance, double interestRate) {
        super(firstName, lastName, accountID, balance);
        this.interestRate = interestRate;
    }

    public void displayAccount(){
        accountSummary();
        System.out.println( "Interest Rate: \t" + interestRate);
    }

    public void processWithdrawal(double amount) {
        if ((balance - amount) < 0) {
            balance -= (amount + 30);
            System.out.println();
            System.out.println("You withdrew $ " + amount + ". Your balance is now $" + balance + ".");
            System.out.println("You have been charged a $30 overdraft fee." );
        } else {
            withdrawal(amount);
        }
    }
}
