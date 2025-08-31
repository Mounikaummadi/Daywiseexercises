class BankAcc{
    constructor(accNumber,balance){
        this.accNumber=accNumber;
        this.balance=balance;
    }
    deposit(amount){
        this.balance+=amount;
        console.log(`${amount} Deposited Successfully! current balance ${this.balance}`);
    }
    withdraw(amount){
        if(amount>this.balance){
            console.log(`Insufficant Balance!Available balance ${this.balance}`);
        }else{
            this.balance-=amount;
            console.log(`Current Balance ${this.balance}`);
        }
    }

}
let e1=new BankAcc('37108',2000);
e1.deposit(300);
e1.withdraw(5000);