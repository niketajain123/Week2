//class BookDetails
class BookDetails{
    //private data members title, author, and price
    private String title;
    private String author;
    private double price;
    public BookDetails(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    //method to display book details
    public void displayDetails(){
        System.out.println("Bok title is "+title+" written by "+author+" and the price is "+price);
    }
}
//Main class
public class MainBookDetails {
    public static void main(String[] args) {
        //object creation
        BookDetails book1=new BookDetails("JAVA","ABC",750);
        BookDetails book2=new BookDetails("Pyhton","XYZ",650);
        //display book deteails
        book1.displayDetails();
        book2.displayDetails();
    }

}
