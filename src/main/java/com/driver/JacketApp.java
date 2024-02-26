package com.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JacketApp {
    public static void main(String[] args) {
        List<Jacket> jackets = new ArrayList<Jacket>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Jacket jacket = createJacket(scanner);
                    if (jacket != null) {
                        jackets.add(jacket);
                        System.out.println("Jacket added successfully.");
                    }
                    break;
                case 2:
                    double totalPrice = calculateTotalPrice(jackets);
                    System.out.println("Total Price of Jackets: $" + totalPrice);
                    break;
                case 3:
                    double averagePrice = calculateAveragePrice(jackets);
                    System.out.println("Average Price of Jackets: $" + averagePrice);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Choose an option:");
        System.out.println("1. Add Jacket");
        System.out.println("2. Calculate Total Price");
        System.out.println("3. Calculate Average Price");
        System.out.println("4. Exit");
    }

    public static Jacket createJacket(Scanner scanner) {
        System.out.println("Enter jacket type (Leather/Denim/Windbreaker): ");
        String type = scanner.next();

        System.out.println("Enter size: ");
        String size = scanner.next();

        System.out.println("Enter color: ");
        String color = scanner.next();
        
        type = type.toLowerCase();

        if ("leather".equals(type)) {
            System.out.println("Does it have fur lining? (true/false): ");
            boolean furLining = scanner.nextBoolean();
            return new LeatherJacket(size, color, furLining);
        } else if ("denim".equals(type)) {
            System.out.println("Enter number of pockets: ");
            int numPockets = scanner.nextInt();
            return new DenimJacket(size, color, numPockets);
        } else if ("windbreaker".equals(type)) {
            System.out.println("Is it waterproof? (true/false): ");
            boolean waterproof = scanner.nextBoolean();
            return new WindbreakerJacket(size, color, waterproof);
        } else {
            System.out.println("Invalid jacket type.");
            return null;
        }
    }

    public static double calculateTotalPrice(List<Jacket> jackets) {
        double total = 0.0;
        for (Jacket jacket : jackets) {
            total += jacket.calculatePrice();
        }
        return total;
    }

    public static double calculateAveragePrice(List<Jacket> jackets) {
        double total = calculateTotalPrice(jackets);
        return total / jackets.size();
    }
}