package com.driver;

public class WindbreakerJacket extends Jacket {
    private boolean waterproof;

    public WindbreakerJacket(String size, String color, boolean waterproof) {
        super(size, color);
        this.waterproof = waterproof;
    }

    @Override
    public double calculatePrice() {
        double basePrice = 0;
        // your code goes here
        return basePrice;
    }
}
