package inheritance.assistedprograms.vehiclehierarchy;

public class MotorCycle extends Vehicle{
    private String color;

    public MotorCycle(int maxSpeed, String fuelType, String color) {
        super(maxSpeed, fuelType);
        this.color = color;
    }

    @Override
    public void displayInfo() {
        System.out.println("MotorCycle : ");
        System.out.println("Maximum Speed : " + maxSpeed+"km/h");
        System.out.println("Fuel Type : " + fuelType);
        System.out.println("Color of MotorCycle : " + color);
        System.out.println("=============================");

    }
}
