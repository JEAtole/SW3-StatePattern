# SW3-StatePattern

## Problem

A bank needs to manage different states of customer accounts, including active, suspended, and closed. Each state has specific rules and restrictions regarding allowed operations, and accounts have associated attributes like account number and balance.

- Active accounts: Allow deposits and withdrawals.
- Suspended accounts: Disallow deposits and withdrawals transactions, but allow viewing account information.
- Closed accounts: Disallow all transactions and viewing of account information.

Currently, the system relies on conditional statements within the Account class to check the account state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.

Implement the State pattern to improve code maintainability and flexibility:

1. Define Account States: Create separate classes representing different account states: ActiveState, SuspendedState, and ClosedState.
2. Implement State Interface: Define an interface AccountState with methods for common actions like deposit, withdraw, activate, suspend, and close.
3. Implement State Behaviors: Each concrete state class implements the AccountState interface, providing specific behavior for its respective state. For example, the ActiveState class would allow deposits and withdrawals, while the ClosedState wouldn't allow any transactions.
4. Update Account Class:
- Include attributes for accountNumber and balance.
- Remove state-specific logic from the Account class.
- Introduce a reference to the current AccountState object.
- Delegate actions like deposit, withdraw, activate, suspend, and close to the current state object through its corresponding methods.

### Logic:
- If the account is active, you can either suspend it or close it.
- If the account is suspended, you can either activate or close it. No deposits and withdrawals allowed.
- If the account is closed, you can neither suspend nor activate it. No deposits and withdrawals allowed.

### Composition of Account:

**Attributes:** <br/>
  accountNumber : String <br/>
  balance:  Double <br/>
  accountState:  AccountState


**Methods:** <br/>
  Setter and getter methods <br/>
  deposit(Double depositAmount): void <br/>
  withdraw(Double withdrawAmount): void <br/>
  suspend(): void <br/>
  activate(): void <br/>
  close() : void <br/>
  toString()   // displays account number and balance <br/>

**Note:  No if-else nor switch will be used**

## Class Diagram









