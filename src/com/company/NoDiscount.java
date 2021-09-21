package com.company;

public class NoDiscount implements DiscountInterface{
    @Override
    public double calculate(double price) {
        return price;
    }
}
