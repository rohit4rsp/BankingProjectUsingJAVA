package com.company;

import java.util.Scanner;

class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    public BankAccount(String cname, String cid) {
        this.balance = 0;
        this.previousTransaction = 0;
        this.customerName = cname;
        this.customerId = cid;
    }

    void deposit(int amount){
        if (amount!= 0 ){
            balance = balance + amount;
            previousTransaction = amount;
            System.out.println("You have deposited "+amount);
        }
    }

    void withdraw(int amount){
        if (amount!= 0 ){
            balance = balance - amount;
            previousTransaction = amount;
            System.out.println("You have Withdrawn "+amount);

        }
    }

    void getPreviousTransaction(){
        if(balance >0){
            System.out.println("Deposited ----->"+ previousTransaction);
        }
        else if(balance<0){
            System.out.println("withdrawn ----->"+ Math.abs(previousTransaction));
        }
        else{
            System.out.println("no active transactions!");
        }
    }

    void showMenu() {
        char option;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!    " + customerName);
        System.out.println("your id is  " + customerId);
        System.out.println("your current balance is:     "+ balance);
        System.out.println("\n");
        System.out.println("A. Check balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("***********************************************************************************************************************************");
            System.out.println("\tEnter an option");
            System.out.println("***********************************************************************************************************************************");
            option = sc.next().charAt(0);
            System.out.println("");

            switch (option) {
                case 'A':
                    System.out.println("---------------------------------------------------------");
                    System.out.println("Balance:  " + balance);
                    System.out.println("---------------------------------------------------------");
                    System.out.println("");
                    break;

                case 'B':
                    System.out.println("---------------------------------------------------------");
                    System.out.println("Enter an Amount to be Deposited");
                    System.out.println("---------------------------------------------------------");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println("");
                    break;

                case 'C':
                    System.out.println("---------------------------------------------------------");
                    System.out.println("Enter an Amount to be Withdrawn");
                    System.out.println("---------------------------------------------------------");
                    int amount1 = sc.nextInt();
                    withdraw(amount1);
                    System.out.println("");
                    break;

                case 'D':
                    System.out.println("---------------------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("---------------------------------------------------------");
                    System.out.println("");
                    break;

                default:
                    System.out.println("Invalid Option!!......Please try again");
                    break;

            }
        }
        while (option != 'E');

        System.out.println("Thanks for using our Services!!!");

    }

}

public class Banking_Application {
    public static void main(String[] args) {

        BankAccount bank1 = new BankAccount("Rohit","21048");
        bank1.showMenu();

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("value: "+ a);

        System.out.println("Enter a character");
        char c = sc.next().charAt(0);
        System.out.println(c+"  is what u entered at index 0");*/

//        String d = sc.next();




    }
}
