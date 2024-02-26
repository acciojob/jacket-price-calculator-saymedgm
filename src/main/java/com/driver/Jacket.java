package com.driver;

public class Jacket {
    public String size;
    public String color;

    public Jacket(String size, String color) {
        this.size = size;
        this.color = color;
    }

    public double calculatePrice() {
        return 50.0; // Base price
    }
}

