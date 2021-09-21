package com.company;

public class Context {
    public double excute(DiscountInterface discountInterface, double price){
        return discountInterface.calculate(price);
    }
}
