//class TrackInventory
class TrackInventory{
    //private members itmeCode, itemName, price
    private int itemCode;
    private String itemName;
    private double price;
    //constructor
    public TrackInventory(int itemCode,String itemName, double price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }
    //method to display details
    public void displayDetails(){
        System.out.println("Item name is "+itemName+" and its code is "+itemCode+" and the price is "+price);
    }
    //method to calculate totalCost
    public void totalCost(int quatity){
        System.out.println("The total cost of "+itemName+" for "+quatity+" quantity is "+(price*quatity));
    }
}
//Main class
public class MainTrackInventory {
    public static void main(String[] args) {
        //object creation
        TrackInventory item1=new TrackInventory(01,"abc",450);
        TrackInventory item2=new TrackInventory(02,"xyz",640);
        //displaying details
        item1.displayDetails();
        item2.displayDetails();
        //calculating total cost
        item1.totalCost(4);
        item2.totalCost(5);
    }
}
