package system.entities;

import Exceptions.DomainExceptions;

public class Account {

    private Integer number;
    private String owner;
    private double balance;
    private double withdrawLimit;

    public Account(Integer number, String owner, double balance, double withdrawLimit) {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    public void deposit(double value){
        balance += value;
    }
    public void withdraw(double value){
        if(value > withdrawLimit){
            throw new DomainExceptions("the amount value exceeds withdraw limit");
        }
        else {
            balance -= value;
        }
    }

    @Override
    public String toString() {
        return "Number: "
                +number+
                "\nOwner: "
                +owner+
                "\nInitial Balance: "
                +balance+
                "\nWithdraw Limit: "
                +withdrawLimit;
    }
}


