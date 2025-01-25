package inheritance.assistedprograms.vehiclehierarchy;

public class Car extends Vehicle{
    private int seatCapacity;
    public Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car : ");
        System.out.println("Maximum Speed : "+maxSpeed+"km/h");
        System.out.println("Fuel Type : "+fuelType);
        System.out.println("Seat Capacity in Car : "+seatCapacity);
        System.out.println("=============================");

    }
}
