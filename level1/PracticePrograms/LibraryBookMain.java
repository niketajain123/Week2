//class LibraryBook
class LibraryBook{
    //private members
    private String title;
    private String author;
    private double price;
    private String availability;
    //parameterized constructor
    public LibraryBook(String title,String author,double price,String availability){
        this.title=title;
        this.author=author;
        this.price=price;
        this.availability=availability;
    }
    //borrow book
    public void borrowBook(){
        if(this.availability.equals("Y")){
            System.out.println("Book can be borrowed!");
            this.availability="N";
        }
        else{
            System.out.println("Book can't be borrowed!");
        }
    }
}
//main class
public class LibraryBookMain {
    public static void main(String[] args) {
        //instantiation
        LibraryBook book1=new LibraryBook("C","abc",750.0,"Y");
        LibraryBook book2=new LibraryBook("C++","xyz",650.0,"Y");
        System.out.println("Book1 borrowing : ");
        book1.borrowBook();
        System.out.println("Book2 borrowing : ");
        book2.borrowBook();
        System.out.println("Book1 borrowing : ");
        book1.borrowBook();
    }
}
