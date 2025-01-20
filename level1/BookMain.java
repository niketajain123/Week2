class Book{
    private static String libraryName="ABC Library";
    private String author;
    private String title;
    private final int isbn;
    public Book(String title,String author,int isbn){
        this.author=author;
        this.title=title;
        this.isbn=isbn;
    }
    public void display(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("ISBN : "+isbn);
    }
    public static void displayLibraryName(){
        System.out.println("Library : "+libraryName);
    }
}
public class BookMain {
    public static void main(String[] args) {
        Book book1=new Book("Java","abc",1111);
        Book book2=new Book("Python","xyz",2222);
        if(book1 instanceof Book){
            System.out.println("BOOK1:");
            book1.display();
            Book.displayLibraryName();
        }
        if(book2 instanceof Book){
            System.out.println("BOOK2:");
            book2.display();
            Book.displayLibraryName();
        }
    }
}
