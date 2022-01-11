package com.mycompany.classno6;

import java.util.Scanner;

public class Loancalculator {
    public static void main(String[] args) {
//        int amount,interestRate,year;
//        float total,monthlyPay;
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter the loan amount:");
//        amount=input.nextInt();
//        System.out.println("enter the interest:");
//        interestRate=input.nextInt();
//        System.out.println("enter the duration:");
//        year=input.nextInt();
//
//        total=amount+(amount*interestRate)/100;
//        monthlyPay=total/(year*12);
          int number;
          Scanner input=new Scanner(System.in);
          number=input.nextInt();
          System.out.println(number%10);
          System.out.println(number/1000);
          System.out.println("product:"+((number%10)*(number/1000)));
        
        
    }
}
