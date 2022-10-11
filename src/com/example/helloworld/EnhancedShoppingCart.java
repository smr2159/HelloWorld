package com.example.helloworld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EnhancedShoppingCart {
    public static void main (String[] args) {
        // Create ArrayList to hold the products
        ArrayList<String> products = new ArrayList<>();
        products.add("EDUC,EDUCATION PRIME SET,384.95,10");
        products.add("CHRI,CHRISTMAS TREE,44.99,7");
        products.add("FREI,FREIGHT TRAIN,199.99,6");
        products.add("STUN,STUNT ARENA,159.99,3");
        products.add("HAND,MATERIAL HANDLER,149.99,2");
        products.add("CAST,CASTLE EXPANSION SET,129.99,7");

        // Create ArrayLists
        HashMap<String, String> information = new HashMap<>();
        HashMap<String, Double> prices = new HashMap<>();
        HashMap<String, Integer> inventory = new HashMap<>();

        // For loop to separate product information
        for (String line : products) {
            String[] items = line.split(",");
            for (String word : items) {
                String code;
                String description;
                double price;
                int numberAvailable;
                String thePrice;
                String amount;
                code = items[0];
                description = items[1];
                thePrice = items[2];
                price = Double.valueOf(thePrice);
                amount = items[3];
                numberAvailable = Integer.valueOf(amount);

                information.put(code, description);
                prices.put(code, price);
                inventory.put(code, numberAvailable);
            }
        }
        System.out.println("Welcome to Sharon's Lego Store.");
        System.out.println("These are the lego sets that we have for sale.");
        System.out.println(information);
        System.out.println("Please enter the product code of the lego set you wish to purchase. ");
        System.out.println(prices);
        System.out.println(inventory);
    }
}
