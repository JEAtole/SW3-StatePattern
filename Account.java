public class Account{

    private String accountNumber;
    private double balance;
    private AccountState accountState = new ActiveState();


    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        accountState.deposit(depositAmount, this);
    };

    public void withdraw(double withdrawAmount) {
        accountState.withdraw(withdrawAmount, this);
    };

    public void activate() {
        accountState.activate(this);
    };

    public void suspend() {
        accountState.suspend(this);
    };

    public void close() {
        accountState.close(this);
    };

    public String toString() {
        String output = "";
        output += "Account number: " + accountNumber + "\n";
        output += "Balance: " + balance + "\n";
        return output;
    };


    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountState getAccountState() {
        return this.accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }


}