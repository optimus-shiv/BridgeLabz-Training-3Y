class Vehicle {
    static double registrationFee = 5000;
    private String ownerName, vehicleType;
    private final String registrationNumber; // Final unique identifier

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", RegNo: " + registrationNumber + ", Fee: " + registrationFee);
        }
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Amit", "Car", "UP32AB1234");
        v1.displayDetails();

        Vehicle.updateRegistrationFee(6000);
        v1.displayDetails();
    }
}

