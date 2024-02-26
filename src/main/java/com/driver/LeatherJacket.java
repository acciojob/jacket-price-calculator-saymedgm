package com.driver;

public class LeatherJacket extends Jacket {
    private boolean hasFurLining;

    public LeatherJacket(String size, String color, boolean hasFurLining) {
        super(size, color);
        this.hasFurLining = hasFurLining;
    }

    @Override
    public double calculatePrice() {
        double basePrice = 0;
        // your code goes here
        return basePrice;
    }
}

