public class MainForVehicle {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle(); // default constructor
        printVehicleDetails(v1);

        Vehicle v2 = new Vehicle("Toyota", "Camry", 25000.0, "Petrol", true);
        printVehicleDetails(v2);

        Vehicle v3 = new Vehicle("Ford", "Mustang", 55000.0, "Petrol", false);
        printVehicleDetails(v3);
    } 

    /*Vehicle v1 = new Vehicle(); // default constructor

    System.out.println("\n");
    v1.start();
    v1.drive();
    float newSp = v1.changeSpeed(40);
    System.out.println("New Speed: " + newSp);
    v1.stop();
    System.out.println("\n");

    float mileage = v1.mileage(25, 500);
    System.out.println("Mileage : " + mileage);

    Vehicle v2 = new Vehicle("Hyundai", "Creta", 2500000);
    v2.setMfgId("ABC456");
    v2.passengerCapacity = 6;
    float mileage2 = v2.mileage(30, 500);
    System.out.println("Mileage : " + mileage2);

    Vehicle v3 = new Vehicle();
    v3.brandName = "Bharat Benz";
    v3.modelName = "Ship";
    v3.colour = "Blue";
    v3.setMfgId("XYZ5678");
    v3.price = 250000000;
    v3.passengerCapacity = 300;

    vehicleDetails(v3);

    System.out.println("\n");
    v3.start();
    v3.drive();
    float newSp2 = v3.changeSpeed(120);
    System.out.println("New Speed: " + newSp2);
    v3.stop();
    System.out.println("\n");
    */

    public static void printVehicleDetails(Vehicle v) {
        System.out.println("===== Vehicle Details =====");
        System.out.println("Brand Name : " + v.brandName);
        System.out.println("Model Name : " + v.modelName);
        System.out.println("Colour : " + v.colour);
        System.out.println("Price : " + v.price);
        System.out.println("MfgId : " + v.getMfgId());
        System.out.println();
    }
}
