package com.revised.finallyblock1;

public class ProductSelection {
    public static void main(String[] args) {
        String[] products = {"Laptop", "Mobile", "Headphones"};
        int index = 5;

        try {
            System.out.println("Selected product: " + products[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid product index.");
        } finally {
            System.out.println("Product selection finished.");
        }
    }
}
