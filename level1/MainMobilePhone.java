//class Mobile Phone
class MobilePhone{
    //private members brand, model, price
    private String brand;
    private String model;
    private double price;
    //construtor
    public MobilePhone(String brand, String model, double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    //method to display
    public void displayDetails(){
        System.out.println("Mobile's brand is "+brand+" and the model is "+model+" with the price "+price);
    }
}//Main class
public class MainMobilePhone {
    public static void main(String[] args) {
        //object creation
        MobilePhone mobile1=new MobilePhone("Xiaomi","Redmi 13C 5G",8999);
        MobilePhone mobile2=new MobilePhone("Samsung","Samung Galaxy A16 5G",16999);
        //displaying details
        mobile1.displayDetails();
        mobile2.displayDetails();
    }
}
