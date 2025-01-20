//book class
class Book{
    //private members
    private String title;
    private String author;
    private double price;
    //default constructor
    public Book(){
        this.author="unknown-author";
        this.title="unknown-title";
        this.price=0.0;
    }
    //parameterized constructor
    public Book(String title,String author, double price){
        this.author=author;
        this.title=title;
        this.price=price;
    }
    //display method
    public void dislayDetails(){
        System.out.println("Title : "+title+"\nAuthor : "+author+"\nPrice : "+price);
    }
}
public class BookMain {
    public static void main(String[] args) {
        //instantiation
        Book book1=new Book();
        Book book2=new Book("Let us Java","Yashwanth Kanetkar",849.0);
        //displaying
        book1.dislayDetails();
        book2.dislayDetails();
    }
}
