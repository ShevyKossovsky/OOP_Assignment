package vehicleRentalSystem;

import vehicleRentalSystem.models.*;

public class Main {
    public static void main(String[] args) {
        // Create vehicles
        Vehicle car1 = new Car("ABC123", "Toyota", "Corolla", 50.0, "Sedan");
        Vehicle truck1 = new Truck("XYZ789", "Mitsubishi", "Outlander", 100.0, 5);

        // Create customers
        Customer regularCustomer = new RegularCustomer("John Doe");
        Customer corporateCustomer = new CorporateCustomer("Jane Smith", "TechCorp");

        // Rent vehicles
        regularCustomer.rentVehicle(car1, 3);
        corporateCustomer.rentVehicle(truck1, 2);

        // Display rented vehicles by the regular customer
        System.out.println("\nRented vehicles by " + regularCustomer.getName() + ":");
        for (Vehicle v : regularCustomer.getRentedVehicles()) {
            System.out.println(v.getModel());
        }

        // Display rented vehicles by the corporate customer
        System.out.println("\nRented vehicles by " + corporateCustomer.getName() + ":");
        for (Vehicle v : corporateCustomer.getRentedVehicles()) {
            System.out.println(v.getModel());
        }
    }
}
