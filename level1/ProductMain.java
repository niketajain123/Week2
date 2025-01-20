class Product{
    private static int discount=20;
    private String productName;
    private double price;
    private int quantity;
    private final int productId;
    public Product(String productName,int productId,double price,int quantity){
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        this.productId=productId;
    }
    public void display(){
        System.out.println("Product name : "+productName);
        System.out.println("Product ID : "+productId);
        System.out.println("Price : "+price);
        System.out.println("Discount : "+discount);
        System.out.println("Quantity : "+quantity);
        System.out.println("Selling price of "+quantity+" products after "+discount+"% discount "+(quantity*(price-price*(discount/100.0))));
    }
    public static void updateDiscount(int newDiscount){
        discount=newDiscount;
        System.out.println("Discount percentage changed to "+discount+"%");
    }

}
public class ProductMain {
    public static void main(String[] args) {
        Product product1=new Product("abc",1,250.0,5);
        Product product2=new Product("xyz",2,350.50,4);
        if(product1 instanceof Product){
            System.out.println("Cart1:");
            product1.display();
        }
        if(product2 instanceof Product){
            System.out.println("Cart2:");
            product2.display();
        }
        Product.updateDiscount(25);
        System.out.println("After updating discount : ");
        product1.display();
    }
}
