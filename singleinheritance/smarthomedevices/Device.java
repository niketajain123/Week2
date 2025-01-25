package inheritance.singleinheritance.smarthomedevices;

public class Device {
    private int deviceId;
    private String status;
    public Device(int deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;
    }
    public void displayStatus(){
        System.out.println("Device ID : device"+deviceId);
        System.out.println("Status : "+status);
    }
}
