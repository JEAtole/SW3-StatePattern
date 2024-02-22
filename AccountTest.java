public class AccountTest {

    public static void main(String[] args) {
        
        Account myAccount = new Account("1234", 10000.0); //set account to active state
        myAccount.activate(); // Displays "Account is already activated!"

        // Suspend the account
        myAccount.suspend(); // Displays "Account is suspended!"

        // Activate the account
        myAccount.activate(); // Displays "Account is activated!"

        // Deposit to the account
        myAccount.deposit(1000.0);
        // Update balance and display account number and current balance.
        // Call the toString() method in the deposit().

        //Withdraw to the account
        myAccount.withdraw(100.0);// update balance and displays account number and
        // current balance. Call the toString() method in withdraw().    


        // Close the account
        myAccount.close();  // Displays "Account is closed!"

        // Activate the account
        myAccount.activate(); //Displays "you cannot activate closed account!"

        // Suspend the account
        myAccount.suspend(); //Displays "you cannot suspend closed account!"

        //Withdraw to the account
        myAccount.withdraw(500.0); // Show message "You cannot withdraw on a closed account!". Call the toString() to show current balance and account number.

        //Deposit to the account
        myAccount.deposit(1000.0); // Show message "You cannot deposit on closed account account!". Call the toString() to show current balance and account number.


    }

}