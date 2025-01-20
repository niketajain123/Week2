class VehicleRegistration{
    //private instance variables
    private String ownerName;
    private String vehicleType;
    //private class variables
    private static int registrationFee=15000;
    //parameterized constructor
    public VehicleRegistration(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    //instance method to display vehicle details
    public void displayVehicleDetails(){
        System.out.println("Owner name : "+ownerName);
        System.out.println("Vehicle type : "+vehicleType);
        System.out.println("Registration Fee : "+registrationFee);
    }
    //class method to update registration fee
    public static void updateRegistrationFee(){
        registrationFee=20000;
    }
}
//main class
public class VehicleRegistrationMain {
    public static void main(String[] args) {
        //object creation
        VehicleRegistration vehicle1=new VehicleRegistration("ABC","abc");
        VehicleRegistration vehicle2=new VehicleRegistration("XYZ","xyz");
        //displaying vehicle details
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        //updating registration fee
        VehicleRegistration.updateRegistrationFee();
        vehicle1.displayVehicleDetails();
    }
}
