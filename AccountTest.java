public class AccountTest { // Removed parentheses from class name
    public static void main(String[] args) {

        // 1. Initialize Account (Set to active state)
        Account myAccount = new Account("1234", 10000.0); 
        
        // 2. Try to activate an already active account
        myAccount.activate(); // Displays: "Account is already activated!"

        // 3. Suspend the account
        myAccount.suspend(); // Displays: "Account is suspended!"

        // 4. Reactivate the account
        myAccount.activate(); // Displays: "Account is activated!"
        
        // 5. Deposit to the account
        // Updates balance and calls toString() inside the method
        myAccount.deposit(1000.0); 

        // 6. Withdraw from the account
        // Updates balance and calls toString() inside the method
        myAccount.withdraw(100.0); 

        // 7. Close the account
        myAccount.close(); // Displays: "Account is closed!"

        // 8. Attempt invalid operations on a closed account
        myAccount.activate(); // Displays: "You cannot activate a closed account!"
        
        // Fixed typo: was my.Account.activate(), changed to myAccount.suspend()
        myAccount.suspend();  // Displays: "You cannot suspend a closed account!"

        // 9. Attempt transactions on a closed account
        // Displays error message and calls toString()
        myAccount.withdraw(500.0); 
        myAccount.deposit(1000.0); 
    }
}