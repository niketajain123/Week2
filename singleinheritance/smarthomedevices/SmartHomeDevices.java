package inheritance.singleinheritance.smarthomedevices;

public class SmartHomeDevices {
    public static void main(String[] args) {
        Device device;
        device=new Thermostat(101,"on",22);
        device.displayStatus();
        System.out.println("===========================");
        device=new Thermostat(102,"off",18);
        device.displayStatus();

    }
}
