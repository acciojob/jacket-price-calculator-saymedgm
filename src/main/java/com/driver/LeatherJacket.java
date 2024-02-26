package com.driver;

public class LeatherJacket extends Jacket {
    private boolean hasFurLining;

    public LeatherJacket(String size, String color, boolean hasFurLining) {
        super(size, color);
        this.hasFurLining = hasFurLining;
    }

    @Override
    public double calculatePrice() {
        double basePrice = super.calculatePrice();
        return basePrice + (hasFurLining ? 30.0 : 0.0);
    }
}
