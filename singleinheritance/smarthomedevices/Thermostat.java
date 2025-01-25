package inheritance.singleinheritance.smarthomedevices;

public class Thermostat extends Device{
    private int temperatureSetting;
    public Thermostat(int deviceId,String status,int temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting=temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature setting is : "+temperatureSetting+"C");
    }
}
