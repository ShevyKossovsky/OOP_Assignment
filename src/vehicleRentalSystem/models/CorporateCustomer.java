package vehicleRentalSystem.models;

import vehicleRentalSystem.Customer;

import java.util.ArrayList;
import java.util.List;

public class CorporateCustomer implements Customer {

    private String name;
    private List<Vehicle> rentedVehicles;
    private String companyName;

    public CorporateCustomer(String name, String companyName) {
        this.name=name;
        this.companyName = companyName;
        this.rentedVehicles = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name + " (Company: " + companyName + ")";
    }

    @Override
    public void rentVehicle(Vehicle vehicle, int days) {
        double discountedCost = vehicle.calculateRentalCost(days) * 0.85;  // Corporate customers get a 15% discount
        rentedVehicles.add(vehicle);
        System.out.println(name + " rented a " + vehicle.getModel() + " for " + days + " days. Discounted cost: $" + discountedCost);
    }

    @Override
    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }
}
