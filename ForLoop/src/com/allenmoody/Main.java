package com.allenmoody;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 a 2% interest = " + calculateInterest(10000.0, 2.0));

        for(int i =0; i<5; i++){
            System.out.println("Loop " + i + " hello!");
        }

        for (int k=2; k<9;k++){

            System.out.println(String.format("%.2f",calculateInterest(10000.0, k)));
        }

        for (int k=8; k>1;k--){

            System.out.println(String.format("%.2f",calculateInterest(10000.0, k)));
        }

        int count = 0;
        for(int t=10; t<50; t++) {
            if(isPrime(t)) {
                count++;
                System.out.println("Number " + t + " is a prime number");
                if(count == 10){
                    System.out.println("Exiting for loop");
                    break;

                }
            }
        }
    }


    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }
        // faster --> for(int j=2; j <= (long) Math.sqrt(n); j++)
        for(int j=2; j <= n/2; j++) {
            if(n % j == 0) {
                return false;
            }
        }

        return true;

    }



    public static double calculateInterest(double amount, double interestRate) {
        return (amount *(interestRate/100));
    }
}
