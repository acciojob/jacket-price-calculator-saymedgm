package com.driver;

public class DenimJacket extends Jacket {
    private int numPockets;

    public DenimJacket(String size, String color, int numPockets) {
        super(size, color);
        this.numPockets = numPockets;
    }

    @Override
    public double calculatePrice() {
        double basePrice = super.calculatePrice();
        return basePrice + (numPockets * 5.0);
    }
}