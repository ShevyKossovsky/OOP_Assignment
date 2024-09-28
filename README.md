
# Vehicle Rental System 🚗

## Project Overview
The system was written in the Java language and demonstrates the principles of object-oriented programming by managing car rental processes. Each vehicle can be represented by a separate class, and interfaces and abstract classes are used to create a hierarchy between the different types of vehicles. The system is able to distinguish between types of customers and vehicles and adjust the rental process accordingly, using loading and forcing methods to manage different behaviors between departments.

## Features:
- Abstract Class Vehicle: Represents the main characteristics of vehicles, with subclasses for different types of vehicles.
- Subclasses:
    - Car: Inherits from Vehicle and implements specific rental cost calculations.
    - Truck: Inherits from Vehicle and includes additional attributes and rental cost logic based on capacity.
- Customer Interface: Defines the behaviors of customers in the rental system, including methods for renting vehicles and retrieving rented vehicle lists.
- Customer Implementations:
    - Regular Customer: Standard implementation for individual customers.
    - Corporate Customer: Offers discounts for corporate clients on vehicle rentals.
- Main Class VehicleRental: The entry point of the application that demonstrates the rental process through various test cases.

## UML Diagram:
![UML Diagram](/src/UML.png)

## Installation:
1. Clone the repository:
```bash
https://github.com/ShevyKossovsky/OOP_Assignment
```
2. Navigate to the project directory:
```bash
cd Vehicle_Rental_System
```
3. Run the application with your java IDE like Eclipse, IntelliJ IDEA, or NetBeans.


# Contact:
Shevy Kossovsky 📞 0556773361 ✉ shevy0556773361@gmail.com
