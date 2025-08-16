
class BankAccount {
    constructor(accountNumber, balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    deposit(amount) {
        if (amount > 0) {
            this.balance += amount;
            console.log(`Deposited: $${amount}. New balance: $${this.balance}`);
        } else {
            console.log("Deposit amount must be positive.");
        }
    }
    withdraw(amount) {
        if (amount > this.balance) {
            console.log("Insufficient balance!");
        } else if (amount <= 0) {
            console.log("Withdraw amount must be positive.");
        } else {
            this.balance -= amount;
            console.log(`Withdrew: $${amount}. New balance: $${this.balance}`);
        }
    }
    getBalance() {
        return this.balance;
    }
}
const account = new BankAccount("123456", 500);

account.deposit(200);      
account.withdraw(100);     
account.withdraw(700);     
account.deposit(-50);      

// Display current balance in HTML
const outputDiv = document.getElementById("output");
outputDiv.innerHTML = `
Account Number: ${account.accountNumber} <br>
Current Balance: $${account.getBalance()}
`;

// Also log to console
console.log("Account Number:", account.accountNumber);
console.log("Current Balance:", account.getBalance());
