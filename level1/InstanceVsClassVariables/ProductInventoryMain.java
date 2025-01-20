class ProductInventory{
    //private instance variables
    private String productName;
    private double price;
    //private class variable
    private static int totalProducts;
    //parameterized constructor
    public ProductInventory(String productName,double price){
        this.productName=productName;
        this.price=price;
        totalProducts++;
    }
    //method to display product details
    public void displayProductDetails(){
        System.out.println("Product name : "+productName+", price : "+price);
    }
    //method to display total number of products
    public static void displayTotalProducts(){
        System.out.println("Number of total products is "+totalProducts);
    }
}
//main class
public class ProductInventoryMain {
    public static void main(String[] args) {
        //object creation
        ProductInventory product1=new ProductInventory("product1",450.50);
        ProductInventory product2=new ProductInventory("product2",550);
        ProductInventory product3=new ProductInventory("product3",250.50);
        //displaying product details
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();
        //displaying total number of products
        ProductInventory.displayTotalProducts();
    }
}
