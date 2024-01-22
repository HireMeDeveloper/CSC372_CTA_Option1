public class Main {
    public static void main(String[] args) {
       // Create a new checking account
        CheckingAccount checkingAccount = new CheckingAccount(
                "Jeffrey",
                "Lamb",
                1234,
                300,
                0.05
        );
        checkingAccount.displayAccount();

        checkingAccount.processWithdrawal(350);
    }
}