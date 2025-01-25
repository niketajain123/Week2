package inheritance.multilevelinheritance.onlineordermanagement;

public class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;
    public DeliveredOrder(int orderId,String orderDate,String status,int trackingNumber, String deliveryDate){
        super(orderId, orderDate, status, trackingNumber);
        this.deliveryDate=deliveryDate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Order Delivered on : "+deliveryDate);
    }
}
