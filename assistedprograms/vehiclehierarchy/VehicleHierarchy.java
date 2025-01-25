package inheritance.assistedprograms.vehiclehierarchy;

public class VehicleHierarchy {
    public static void main(String[] args) {
        Vehicle[]vehicles=new Vehicle[5];
        Vehicle vehicle;
        vehicle=new Vehicle(110,"Petrol");
        vehicles[0]=vehicle;
        vehicle=new Car(180,"CNG",4);
        vehicles[1]=vehicle;
        vehicle=new Truck(150,"Deisel","Mahindra");
        vehicles[2]=vehicle;
        vehicle=new MotorCycle(140,"Petrol","Black");
        vehicles[3]=vehicle;
        vehicle=new Car(160,"Petrol",7);
        vehicles[4]=vehicle;
        for(Vehicle v:vehicles){
            v.displayInfo();
        }
    }
}
