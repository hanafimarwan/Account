
# Account Service

## Description
This project implements a simple `Account` class that adheres to the `AccountService` interface. It allows users to deposit, withdraw money, and print a formatted account statement.

## Features
- Deposit funds into the account
- Withdraw funds from the account (ensuring sufficient balance)
- Print a formatted statement of all transactions

## Installation
1. Clone the repository:
   ```sh
   git clone <repository_url>
   ```
2. Navigate to the project directory:
   ```sh
   cd account-service
   ```
3. Compile the project:
   ```sh
   javac Account.java
   ```

## Usage
1. Create an instance of `Account`:
   ```java
   Account myAccount = new Account();
   ```
2. Perform transactions:
   ```java
   myAccount.deposit(3000);
   myAccount.withdraw(1500);
   ```
3. Print the statement:
   ```java
   myAccount.printStatement();
   ```

## Example Output
```
Date       || Amount    || Balance
30/01/2025 || 3000      || 3000
30/01/2025 || -1500     || 1500
```

## License
This project is licensed under the MIT License.

