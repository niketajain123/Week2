package inheritance.multilevelinheritance.onlineordermanagement;

public class ShippedOrder extends Order{
    protected int trackingNumber;
    public ShippedOrder(int orderId,String orderDate,String status,int trackingNumber){
        super(orderId, orderDate, status);
        this.trackingNumber=trackingNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Tracking number : "+trackingNumber);
    }
}
