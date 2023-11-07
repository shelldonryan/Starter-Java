package Model;

import Exception.WithdrawException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this. withdrawLimit = withdrawLimit;
    }

    public int getnumber() {
        return number;
    }
    public String getHolder() {
        return holder;
    }    
    public double getBalance() {
        return balance;
    }
    
    public double getWithdrawLimit() {
        return withdrawLimit;
    }


    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > getBalance()) {
            throw new WithdrawException("Amount must be greater than your balance");
        } else if (amount > withdrawLimit) {
            throw new WithdrawException("Amount must be greater than your limit");
        } else {
            this.balance -= amount;
        }
        
    }
}