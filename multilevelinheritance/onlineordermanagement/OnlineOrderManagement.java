package inheritance.multilevelinheritance.onlineordermanagement;

public class OnlineOrderManagement {
    public static void main(String[] args) {
        Order order;
        order=new DeliveredOrder(101,"20/12/2024","Order Delivered!",1111111,"22/12/2024");
        order.displayDetails();
    }
}
