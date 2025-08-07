package com.mphasis.day4;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accNo, double initialBalance) {
        accountNumber = accNo;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class AssignmentQ5 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("123456", 5000);
        acc.display();
        acc.deposit(1500);
        acc.withdraw(2000);
        acc.display();
    }
}
