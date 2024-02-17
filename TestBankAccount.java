public class TestBankAccount {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1.5);

        checkingAccount.setFirstName("Larry");
        checkingAccount.setLastName("Jerry");
        checkingAccount.setAccountID(5555555);

        checkingAccount.deposit(675.0);
        checkingAccount.processWithdrawal(320.0);
        checkingAccount.processWithdrawal(480.0); //Overdraft

        checkingAccount.displayAccount();
    }
}