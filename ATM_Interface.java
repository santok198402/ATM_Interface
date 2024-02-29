package com.company;

import java.util.Scanner;

public class ATM_Interface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=0;
        System.out.println("ATM Machine");
        System.out.println("Choose 1 for withdraw");
        System.out.println("Choose 2 for deposite");
        System.out.println("Choose 3 for check balance");
        System.out.println("Choose 4 for exit");

         while(true) {
             System.out.println("Select your option");
             int option=sc.nextInt();
             switch (option) {
                 case 1:
                     System.out.println("Enter the amount to be withdrawn");
                     int amount=sc.nextInt();
                     if(amount>balance){
                         System.out.println("Don't have enough balance");
                     }
                     else{
                         balance=balance-amount;
                     }
                     System.out.println("You have withdrawn"+amount+"Thank you");
                     break;
                 case 2:
                     System.out.println("Enter the amount to be deposited");
                     int deposit=sc.nextInt();
                     balance=balance+deposit;
                     System.out.println("Your money has been successfully deposited");
                     break;
                 case 3:
                     System.out.println(balance);
                     break;
                 case 4:
                     System.out.println("Come Again");
                     break;
                 default:
                     System.out.println("Please enter a valid option");
             }
             if(option==4){
                 break;
             }
         }

    }
}
