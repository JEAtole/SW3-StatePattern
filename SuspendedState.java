public class SuspendedState implements AccountState{

    @Override
    public void deposit(double depositAmount, Account account) {
        System.out.println("You cannot deposit on suspended account!");
        System.out.println(account.toString());
    };

    @Override
    public void withdraw(double withdrawAmount, Account account) {
        System.out.println("You cannot withdraw on suspended account!");
        System.out.println(account.toString());
    };

    @Override
    public void activate(Account account) {
        account.setAccountState(new ActiveState());
        System.out.println("Account is activated!\n");
    };

    @Override
    public void suspend(Account account) {
        System.out.println("Account is already suspended!\n");
    };

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!\n");
    };

}