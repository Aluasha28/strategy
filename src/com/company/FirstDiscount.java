package com.company;

public class FirstDiscount implements DiscountInterface{
    @Override
    public double calculate(double price) {
        return price*0.9;
    }
}
