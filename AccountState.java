public interface AccountState {

    public void deposit(double depositAmount);
    public void withdraw(double withdrawAmount);
    public void activate(Account account);
    public void suspend(Account account);
    public void close(Account account);

}