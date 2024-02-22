public class ClosedState implements AccountState{
    
    private Account account;

    public ClosedState(Account account){
        this.account = account;
    }

    @Override
    public void deposit(double depositAmount) {
        System.out.println("You cannot deposit on closed account!");
        System.out.println(account.toString());
    };

    @Override
    public void withdraw(double withdrawAmount) {
        System.out.println("You cannot deposit on closed account!");
        System.out.println(account.toString());
    };

    @Override
    public void activate(Account account) {
        System.out.println("You cannot activate closed account!\n");
    };

    @Override
    public void suspend(Account account) {
        System.out.println("You cannot suspend closed account!\n");
    };

    @Override
    public void close(Account account) {
        System.out.println("Account is already closed!\n");
    };

}