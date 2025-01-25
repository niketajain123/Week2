package inheritance.assistedprograms.vehiclehierarchy;

public class Truck extends Vehicle{
    private String company;

    public Truck(int maxSpeed, String fuelType, String company) {
        super(maxSpeed, fuelType);
        this.company =company;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck : ");
        System.out.println("Maximum Speed : " + maxSpeed+"km/h");
        System.out.println("Fuel Type : " + fuelType);
        System.out.println("Company of Truck : " + company);
        System.out.println("=============================");

    }
}
