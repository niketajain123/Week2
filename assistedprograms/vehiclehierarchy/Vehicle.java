package inheritance.assistedprograms.vehiclehierarchy;

public class Vehicle {
    protected int maxSpeed;
    protected String fuelType;
    public Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    public void displayInfo(){
        System.out.println("Vehicle : ");
        System.out.println("Maximum Speed : "+maxSpeed+"km/h");
        System.out.println("Fuel Type : "+fuelType);
        System.out.println("=============================");
    }
}
