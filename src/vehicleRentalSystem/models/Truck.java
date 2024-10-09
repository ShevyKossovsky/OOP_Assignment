package vehicleRentalSystem.models;


// Truck.java
public class Truck extends Vehicle {
    private  int capacity;  // Capacity in tons

    public Truck(String licensePlate, String make, String model, double rentalPrice, int capacity) {
        super(licensePlate, make, model, rentalPrice);
        this.capacity = capacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Daily rental cost plus additional cost based on truck capacity
        return (getRentalPrice() + capacity) * days;
    }

    public int getCapacity() {
        return capacity;
    }
}