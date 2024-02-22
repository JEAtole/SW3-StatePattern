public class ActiveState implements AccountState{

    private Account account;

    public ActiveState(Account account){
        this.account = account;
    }

    @Override
    public void deposit(double depositAmount) {
        System.out.println("Deposit amount: " + depositAmount);
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println(account.toString());
    };

    @Override
    public void withdraw(double withdrawAmount) {
        System.out.println("Withdraw amount: " + withdrawAmount);
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println(account.toString());
    };

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!\n");
    };

    @Override
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState(account));
        System.out.println("Account is suspended!\n");
    };

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState(account));
        System.out.println("Account is closed!\n");
    };



}