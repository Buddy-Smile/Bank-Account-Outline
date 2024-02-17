public class CheckingAccount extends BankAccount {
    private double interestRate;
    private static final double OVERDRAFT_FEE = 30.0; //$30 Fee

    public CheckingAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    public void processWithdrawal(double amount) {
        if (getBalance() < amount) {
            System.out.println("OOPS, you're broke! Overdraft");
            super.withdrawal(amount + OVERDRAFT_FEE);
        } else {
            super.withdrawal(amount);
        }
    }

    public void displayAccount() {
        super.accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    // Setters and getters
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

