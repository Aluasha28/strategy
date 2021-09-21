package com.company;

public class SecondDiscount implements DiscountInterface {
    @Override
    public double calculate(double price) {
        return price*0.85;
    }
}
