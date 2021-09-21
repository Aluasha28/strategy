package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double price = 30;
        Context context = new Context();

        System.out.println("Your discount:");
        System.out.println(context.excute(new FirstDiscount(), price) + " $");

    }
}
