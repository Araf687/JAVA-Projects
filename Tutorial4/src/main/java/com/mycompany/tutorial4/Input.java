
package com.mycompany.tutorial4;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner input=new Scanner(System.in);
        int salary=input.nextInt();
//        System.out.println("enter your name:");
//        String name=input.next();
        System.out.println("enter your name:");
        String fullName=input.nextLine();
        System.out.println("\n"+fullName);
        
    }
}
