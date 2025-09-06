# Banking-System-using-OOPs-Java

🔎 Project Overview
The project demonstrates:

Encapsulation → Account details (balance, account number, etc.) are hidden inside classes.
Inheritance → SavingAccount and CurrentAccount extend the base BankAccount class.
Polymorphism → Overriding methods like withdraw() and Accountinfo() in child classes.
Abstraction → Only essential details are exposed through public methods.
It simulates real-world banking operations like deposit, withdrawal, interest calculation, and overdraft facility.

🏗️ Features Implemented
1. BankAccount (Base Class)
Stores common account information (account number, holder name, balance).
Provides methods:
deposit(int amount) – Add money to account.
withdraw(int amount) – Withdraw money (basic version).
getBalance() – Show current balance.
checkInterestRate(int time) – Calculate simple interest.
Accountinfo() – Display account details.

3. SavingAccount (Child Class)
Inherits from BankAccount.
Extra Features:
Minimum Balance Rule → Account must always have at least ₹500.
Interest Rate → Fixed at 5%.
Overrides withdraw() to ensure minimum balance is maintained.
Overrides Accountinfo() to also display interest rate.

3. CurrentAccount (Child Class)
Inherits from BankAccount.
Extra Feature:
Overdraft Facility → Allows withdrawing extra money beyond balance (up to ₹1000).
Overrides withdraw() method to implement overdraft logic.

⚡ Demonstrated OOPs Concepts
Encapsulation → balance, accountnumber, and accountholder are protected/private with methods for controlled access.
Inheritance → SavingAccount and CurrentAccount extend BankAccount.
Polymorphism → Method overriding (withdraw(), Accountinfo()).
Reusability → Base methods like deposit() and getBalance() reused in child classes.
