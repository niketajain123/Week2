package inheritance.hybridinheritance.restaurantmanagementsystem;

public class Waiter extends Person implements Worker {
    public Waiter(String name,int id){
        super(name,id);
    }
    @Override
    public void performDuties() {
        System.out.println("Serving...");
    }

    @Override
    public void display() {
        System.out.println("Waiter...");
        super.display();
        performDuties();
    }
}
