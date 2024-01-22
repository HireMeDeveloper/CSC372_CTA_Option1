public class BankAccount {
    protected String firstName;
    protected String lastName;
    protected int accountID;
    protected double balance;

    public BankAccount(String firstName, String lastName, int accountID, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    protected void withdrawal(double amount){
        System.out.println();
        if(balance - amount < 0) {
            System.out.println("Insufficient funds. Withdrawal denied");
            return;
        }
        balance -= amount;
        System.out.println("You withdrew $ " + amount + ". Your balance is now $" + balance + ".");
    }

    protected void accountSummary(){
        System.out.println();
        System.out.println(
                "First Name: \t" + firstName + "\n" +
                "Last Name: \t\t" + lastName + "\n" +
                "Account ID: \t" + accountID + "\n" +
                "Balance: \t\t" + balance
        );
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }
}
