public class SuspendedState implements AccountState{

    private Account account;

    public SuspendedState(Account account){
        this.account = account;
    }

    @Override
    public void deposit(double depositAmount) {
        System.out.println("You cannot deposit on suspended account!\n");
        System.out.println(account.toString());
    };

    @Override
    public void withdraw(double withdrawAmount) {
        System.out.println("You cannot withdraw on suspended account!\n");
        System.out.println(account.toString());
    };

    @Override
    public void activate(Account account) {
        account.setAccountState(new ActiveState(account));
        System.out.println("Account is activated!\n");
    };

    @Override
    public void suspend(Account account) {
        System.out.println("Account is already suspended!\n");
    };

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState(account));
        System.out.println("Account is closed!\n");
    };

}