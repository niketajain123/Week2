//class CarRental
class CarRental{
    //private members
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double cost;
    //parameterized constructor
    public CarRental(String customerName,String carModel,int rentalDays,double cost){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
        this.cost=cost;
    }
    public void calculateCost(){
        System.out.println("Total cost for "+rentalDays+" is "+(cost*rentalDays));
    }

}

public class CarRentalMain {
    public static void main(String[] args) {
        CarRental car1=new CarRental("abc","xyz",3,250);
        car1.calculateCost();
    }
}
