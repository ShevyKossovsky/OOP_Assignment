package vehicleRentalSystem.models;

// RegularCustomer.java
import vehicleRentalSystem.Customer;

import java.util.ArrayList;
import java.util.List;

public class RegularCustomer implements Customer {
    private String name;
    private List<Vehicle> rentedVehicles;

    public RegularCustomer(String name) {
        this.name = name;
        this.rentedVehicles = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void rentVehicle(Vehicle vehicle, int days) {
        rentedVehicles.add(vehicle);
    }

    @Override
    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }
}
