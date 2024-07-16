package com.perscholas.java_basics;

public class ThreeVariables {
    public static void main(String[] args) {
        double coffee, cappuccino, espresso, greenTea;
        coffee = 3.50;
        cappuccino = 4.50;
        espresso = 3.00;
        greenTea = 2.50;
        final double SALES_TAX = 0.08;
        double subTotal = (3 * coffee) + (4 * cappuccino) + (2 * espresso);
        double totalSale = (subTotal * SALES_TAX) + subTotal;

        System.out.println(totalSale);
    }
}
