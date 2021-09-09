/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 *
 * Subtotal: $64.00
Tax: $3.52
Total: $67.52
 */

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        String price_itemOne = input.nextLine(); //Reads the price of item 1.
        System.out.print("Enter the quantity of item 1: ");
        String quantity_itemOne = input.nextLine(); //Reads the quantity of item 1.
        System.out.print("Enter the price of item 2: ");
        String price_itemTwo = input.nextLine(); //Reads the price of item 2.
        System.out.print("Enter the quantity of item 2: ");
        String quantity_itemTwo = input.nextLine(); //Reads the quantity of item 2.
        System.out.print("Enter the price of item 3: ");
        String price_itemThree = input.nextLine(); //Reads the price of item 3.
        System.out.print("Enter the quantity of item 3: ");
        String quantity_itemThree = input.nextLine(); //Reads the quantity of item 3.

        int oneP = Integer.parseInt(price_itemOne); //Converting string into int.
        int oneQ = Integer.parseInt(quantity_itemOne);
        int twoP = Integer.parseInt(price_itemTwo);
        int twoQ = Integer.parseInt(quantity_itemTwo);
        int threeP = Integer.parseInt(price_itemThree); //Converting string into int.
        int threeQ = Integer.parseInt(quantity_itemThree);

        //Subtotal calculation:
        double subtotal = (oneP * oneQ) + (twoP * twoQ) + (threeP * threeQ);

        //Tax calculations:
        double taxPercentage = 0.055;
        double subtotalTax = subtotal * taxPercentage;

        //Total calculations:
        double total = subtotal + subtotalTax;

        //Printing checkout:
        System.out.println("Subtotal: $" +subtotal);
        System.out.println("Tax: $" +subtotalTax);
        System.out.println("Total: $" +total);


    }
}
