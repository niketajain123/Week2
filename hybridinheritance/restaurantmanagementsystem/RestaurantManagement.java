package inheritance.hybridinheritance.restaurantmanagementsystem;

public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef=new Chef("Alice",101);
        Waiter waiter=new Waiter("Bob",202);
        chef.display();
        System.out.println("================");
        waiter.display();
    }
}
