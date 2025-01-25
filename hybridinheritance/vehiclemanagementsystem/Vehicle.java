package inheritance.hybridinheritance.vehiclemanagementsystem;

public class Vehicle {
    private int maxSpeed;
    private String model;
    public Vehicle(int maxSpeed,String model){
        this.model=model;
        this.maxSpeed=maxSpeed;
    }
    public void display(){
        System.out.println("Model : "+model);
        System.out.println("Max Speed : "+maxSpeed+"km/h");
    }

}
