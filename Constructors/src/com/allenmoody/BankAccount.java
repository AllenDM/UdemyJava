package com.allenmoody;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("1", 0.0, "Default Name", "Default address", "Default phone number");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("999999", 0.00, customerName, email, phoneNumber);

    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }




    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("Deposit of " + deposit + " made. Current balance is " + this.balance);
    }

    public void withdrawFunds(double withdrawal) {
        if (balance - withdrawal >= 0) {
            balance -= withdrawal;
            System.out.println("Withdrawal of " + withdrawal + " processed. Remaining balance = " + balance);
        }

        else {
            System.out.println("Insufficient funds, " + balance + " available");
        }

    }

}
