package com.allenmoody;

public class Main {

    public static void main(String[] args) {
//        BankAccount checkingOne = new BankAccount(); //"1000", 0, "Allen Moody",
//               // "allen3kgt@gmail.com", "904-339-2311");
//
//        System.out.println("Account number is " + checkingOne.getAccountNumber());
//
//
//        System.out.println("Current balance is " + checkingOne.getBalance());
//
//
//        System.out.println("Account holder name is " + checkingOne.getCustomerName());
//
//
//        System.out.println("Account holder email is " + checkingOne.getEmail());
//
//
//        System.out.println("Account holder phone number is " + checkingOne.getPhoneNumber());
//
//        checkingOne.depositFunds(379.56);
//        System.out.println("Current balance is " + checkingOne.getBalance());
//
//        checkingOne.withdrawFunds(100);
//        System.out.println("Current balance is " + checkingOne.getBalance());

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

        // BankAccount checkingTwo = new BankAccount("Allen", "allen3kgt@gmail.com", "904-339-2311");
        // System.out.println(checkingTwo.getAccountNumber() + " name " + checkingTwo.getCustomerName());




    }
}
