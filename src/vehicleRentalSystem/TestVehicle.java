package vehicleRentalSystem;


import vehicleRentalSystem.models.*;

import java.util.List;

public class TestVehicle {
    public static void main(String[] args) {
        // Test 1: Create vehicle instances
        Vehicle car1 = new Car("ABC123", "Toyota", "Corolla", 50.0, "Sedan");
        Vehicle car2 = new Car("DEF456", "Honda", "Civic", 60.0, "Sedan");
        Vehicle truck1 = new Truck("XYZ789", "Mitsubishi", "Outlander", 100.0, 5);
        Vehicle truck2 = new Truck("HIJ321", "Ford", "F-150", 150.0, 8);

        // Test 2: Create customer instances
        Customer regularCustomer = new RegularCustomer("John Doe");
        Customer corporateCustomer = new CorporateCustomer("Jane Smith", "TechCorp");

        // Test 3: Rent vehicles for regular customer
        System.out.println("Renting vehicles for regular customer:");
        regularCustomer.rentVehicle(car1, 3); // 3 days rental for car1
        regularCustomer.rentVehicle(truck1, 2); // 2 days rental for truck1

        // Test 4: Rent vehicles for corporate customer
        System.out.println("Renting vehicles for corporate customer:");
        corporateCustomer.rentVehicle(car2, 5); // 5 days rental for car2
        corporateCustomer.rentVehicle(truck2, 4); // 4 days rental for truck2

        // Test 5: Display rented vehicles for regular customer
        System.out.println("\nRented vehicles by " + regularCustomer.getName() + ":");
        List<Vehicle> regularCustomerVehicles = regularCustomer.getRentedVehicles();
        for (Vehicle v : regularCustomerVehicles) {
            System.out.println(v.getModel() + " - Rental cost: ₪" + v.calculateRentalCost(3)); // Display cost based on days
        }

        // Test 6: Display rented vehicles for corporate customer
        System.out.println("\nRented vehicles by " + corporateCustomer.getName() + ":");
        List<Vehicle> corporateCustomerVehicles = corporateCustomer.getRentedVehicles();
        for (Vehicle v : corporateCustomerVehicles) {
            System.out.println(v.getModel() + " - Rental cost: ₪" + v.calculateRentalCost(4)); // Display cost based on days
        }

        // Test 7: Calculate and display total rental cost for each customer
        double totalCostRegularCustomer = 0;
        for (Vehicle v : regularCustomerVehicles) {
            totalCostRegularCustomer += v.calculateRentalCost(3);
        }
        System.out.println("\nTotal rental cost for " + regularCustomer.getName() + ": ₪" + totalCostRegularCustomer);

        double totalCostCorporateCustomer = 0;
        for (Vehicle v : corporateCustomerVehicles) {
            totalCostCorporateCustomer += v.calculateRentalCost(4);
        }
        System.out.println("Total rental cost for " + corporateCustomer.getName() + ": ₪" + totalCostCorporateCustomer);
    }
}
