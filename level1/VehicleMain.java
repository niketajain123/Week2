class Vehicle{
    private static int registrationFee=2000;
    private String ownerName;
    private String vehicleType;
    private final int registrationNumber;
    public Vehicle(String ownerName,String vehicleType,int registrationNumber){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        this.registrationNumber=registrationNumber;
    }
    public static void updateRegistrationFee(int fee){
        registrationFee=fee;
        System.out.println("Regsitration fee is updated to "+fee);
    }
    public void display(){
        System.out.println("Owner name : "+ownerName);
        System.out.println("Vehicle type : "+vehicleType);
        System.out.println("egistration number : "+registrationNumber);
        System.out.println("Registration fee : "+registrationFee);
    }

}
public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle1=new Vehicle("abc","A",1111);
        Vehicle vehicle2=new Vehicle("xyz","X",2222);
        if(vehicle1 instanceof Vehicle){
            System.out.println("Vehicle1 : ");
            vehicle1.display();
        }
        if(vehicle2 instanceof Vehicle){
            System.out.println("Vehicle2 : ");
            vehicle2.display();
        }
        Vehicle.updateRegistrationFee(2500);
        if(vehicle1 instanceof Vehicle){
            System.out.println("Vehicle1 : ");
            vehicle1.display();
        }
    }
}