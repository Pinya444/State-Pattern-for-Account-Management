public class Account {
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        // Default state is Active
        this.accountState = new ActiveState();
    }

    // Delegation Methods
    public void deposit(Double depositAmount) {
        accountState.deposit(this, depositAmount);
    }

    public void withdraw(Double withdrawAmount) {
        accountState.withdraw(this, withdrawAmount);
    }

    public void activate() {
        accountState.activate(this);
    }

    public void suspend() {
        accountState.suspend(this);
    }

    public void close() {
        accountState.close(this);
    }

    // Getters and Setters
    public Double getBalance() { return balance; }
    public void setBalance(Double balance) { this.balance = balance; }
    public void setAccountState(AccountState accountState) { this.accountState = accountState; }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}