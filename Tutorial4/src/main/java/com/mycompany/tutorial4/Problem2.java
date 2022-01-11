package com.mycompany.tutorial4;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println("enter the total sales of today");
        Scanner input =new Scanner(System.in);
        int totalSales=input.nextInt();
        double percentageOfSale=(totalSales*10)/100;
        double restMoney=totalSales-percentageOfSale;
        System.out.println(percentageOfSale+" "+restMoney+"\n");
    }
}
