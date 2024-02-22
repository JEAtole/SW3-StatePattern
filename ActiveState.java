public class ActiveState implements AccountState{

    @Override
    public void deposit(double depositAmount, Account account) {
        System.out.println("Deposit amount: " + depositAmount);
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println(account.toString());
    };

    @Override
    public void withdraw(double withdrawAmount, Account account) {
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
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!\n");
    };

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!\n");
    };



}