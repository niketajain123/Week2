package inheritance.hybridinheritance.restaurantmanagementsystem;


public class Chef extends Person implements Worker {
    public Chef(String name,int id){
        super(name,id);
    }

    @Override
    public void performDuties() {
        System.out.println("Cooking....");
    }

    @Override
    public void display() {
        System.out.println("Chef...");
        super.display();
        performDuties();
    }
}
