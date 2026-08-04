package com.mycompany.Alquiler_autoss;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Company company = new Company();

    public static void main(String[] args) {
        int option;
        do {
            showMenu();
            option = readInt("Select an option: ");
            switch (option) {
                case 1 -> manageVehicles();
                case 2 -> manageCustomers();
                case 3 -> manageRentals();
                case 4 -> manageReturns();
                case 5 -> billing();
                case 6 -> reports();
                case 7 -> System.out.println("Exiting the system...");
                default -> System.out.println("Invalid option.");
            }
        } while (option != 7);
    }

    static void showMenu() {
        System.out.println("\n===== VEHICLE RENTAL SYSTEM =====");
        System.out.println("1. Vehicle management");
        System.out.println("2. Customer management");
        System.out.println("3. Rental management");
        System.out.println("4. Returns");
        System.out.println("5. Billing");
        System.out.println("6. Reports");
        System.out.println("7. Exit");
    }

    static void manageVehicles() {
        System.out.println("\n--- Register Vehicle ---");
        System.out.print("Plate: ");
        String plate = sc.nextLine();
        System.out.print("Brand: ");
        String brand = sc.nextLine();
        System.out.print("Model: ");
        String model = sc.nextLine();
        double rate = readDouble("Daily rate: ");
        company.registerVehicle(new Vehicle(plate, brand, model, rate));
        System.out.println("Vehicle successfully registered.");
    }

    static void manageCustomers() {
        System.out.println("\n--- Register Customer ---");
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        company.registerCustomer(new Customer(id, name, phone));
        System.out.println("Customer successfully registered.");
    }

    static void manageRentals() {
        System.out.println("\n--- Register Rental ---");
        System.out.print("Vehicle plate: ");
        String plate = sc.nextLine();
        System.out.print("Customer ID: ");
        String id = sc.nextLine();
        int days = readInt("Rental days: ");

        Rental r = company.rentVehicle(plate, id, days);
        if (r != null) {
            System.out.println("Rental successfully registered.");
            System.out.println(r);
        } else {
            System.out.println("Could not register rental (check plate, customer, or availability).");
        }
    }

    static void manageReturns() {
        System.out.println("\n--- Register Return ---");
        System.out.print("Vehicle plate: ");
        String plate = sc.nextLine();

        if (company.registerReturn(plate)) {
            System.out.println("Return successfully registered.");
        } else {
            System.out.println("No active rental found for that plate.");
        }
    }

    static void billing() {
        System.out.println("\n--- Billing ---");
        System.out.print("Vehicle plate: ");
        String plate = sc.nextLine();

        for (Rental r : company.getRentals()) {
            if (r.getVehicle().getPlate().equalsIgnoreCase(plate)) {
                System.out.println(r);
                return;
            }
        }
        System.out.println("No rental found for that plate.");
    }

    static void reports() {
        System.out.println("\n--- Vehicles ---");
        for (Vehicle v : company.getVehicles()) {
            System.out.println(v);
        }

        System.out.println("\n--- Customers ---");
        for (Customer c : company.getCustomers()) {
            System.out.println(c);
        }

        System.out.println("\n--- Rentals ---");
        for (Rental r : company.getRentals()) {
            System.out.println(r);
        }
    }

    static int readInt(String message) {
        System.out.print(message);
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            System.out.print(message);
            sc.next();
        }
        int value = sc.nextInt();
        sc.nextLine();
        return value;
    }

    static double readDouble(String message) {
        System.out.print(message);
        while (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            System.out.print(message);
            sc.next();
        }
        double value = sc.nextDouble();
        sc.nextLine();
        return value;
    }
}