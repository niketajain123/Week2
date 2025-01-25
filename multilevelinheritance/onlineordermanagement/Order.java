package inheritance.multilevelinheritance.onlineordermanagement;

public class Order {
    private int orderId;
    private String orderDate;
    private  String status;
    public Order(int orderId,String orderDate,String status){
        this.orderDate=orderDate;
        this.orderId=orderId;
        this.status=status;
    }
    public String getOrderStatus(){
        return status;
    }
    public void displayDetails(){
        System.out.println("OrderId : "+orderId);
        System.out.println("Order Placed on : "+orderDate);
        System.out.println("Status is : "+status);
    }
}
