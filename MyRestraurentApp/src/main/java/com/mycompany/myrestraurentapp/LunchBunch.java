package com.mycompany.myrestraurentapp;

import java.util.Scanner;

public class LunchBunch {
    public static void main(String[] args) {
        String foodName[]={"Burger","Pizza","Pasta","Noodles","Mozito","Fuchka","Chotpoti"};
        String choosenFood=" ",f="";
        int price[]={100,200,250,150,300,80,80};
        int totalPrice=0,i=0,flag=1,foodQuantity = 0,linePrevent=1;
        Scanner input=new Scanner(System.in);
        boolean needFood=true;
        System.out.println("-----------------------Welcome to LunchBunch Cafe--------------");
        System.out.println("\n");
        System.out.println("-----------------------Our Food Manue---------------------------");
        System.out.println("\n\n");
        for(i=0;i<foodName.length;i++){
            System.out.println(foodName[i]+"\t\t"+price[i]);  
        }
        while(needFood){
            if(flag==1){
                System.out.println("Write your food name:");
                choosenFood = input.nextLine().toLowerCase();
                flag=0;
            }
            else{
                if(linePrevent==1){
                    input.nextLine();
                }
                System.out.println("Anything else Sir:");
                choosenFood=input.nextLine().toLowerCase(); 
                linePrevent=1;
            }
            switch(choosenFood){
                case "burger":
                    System.out.println("Enter the quantity:");
                    foodQuantity=input.nextInt();
                    totalPrice=totalPrice+(100*foodQuantity);
                    break;
                case "noodles":
                    System.out.println("Enter the quantity:");
                    foodQuantity=input.nextInt();
                    totalPrice=totalPrice+(150*foodQuantity);
                    break;
                case "pasta":
                    System.out.println("Enter the quantity:");
                    foodQuantity=input.nextInt();
                    totalPrice=totalPrice+(200*foodQuantity);
                    break;
                case "mozito":
                    System.out.println("Enter the quantity:");
                    foodQuantity=input.nextInt();
                    totalPrice=totalPrice+(250*foodQuantity);
                    break;
                case "fuchka":
                    System.out.println("Enter the quantity:");
                    foodQuantity=input.nextInt();
                    totalPrice=totalPrice+(80*foodQuantity);
                    break;
                case "chotpoti":
                    System.out.println("Enter the quantity:");
                    foodQuantity=input.nextInt();
                    totalPrice=totalPrice+(80*foodQuantity);
                    break;
                case "pizza":
                    System.out.println("Enter the quantity:");
                    foodQuantity=input.nextInt();
                    totalPrice=totalPrice+(300*foodQuantity);
                    break;
                case "nothing":
                    needFood=false;
                    break;
                default:
                    System.out.println("Food not in the menu. Checkh the menu and choose again!");
                    linePrevent=0;
                    break;
            } 
        }
        System.out.println("--------------------Billing Detailse---------");
        System.out.println("You have to pay: "+totalPrice);
        System.out.println("Pay:");
        int payment=input.nextInt();
        int rest=totalPrice-payment;
        if(rest==0)
        {
            System.out.println("Thank you Sir. Come again!");
        }
        else if(rest>0){
            System.out.println("Please,pay the rest "+rest);
        }
        else{
            System.out.println("Sir,Here your change"+(rest*(-1))+"Taka.Thank you Sir. Come again!");
        }
    }
    
}
