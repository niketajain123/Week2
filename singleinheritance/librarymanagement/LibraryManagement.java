package inheritance.singleinheritance.librarymanagement;

public class LibraryManagement {
    public static void main(String[] args) {
        Book book1=new Author("Java",1996,"James Gosling","Father of Java");
        Book book2=new Author("C",1988,"Dennis Ritchie","Father of C");
        book1.displayInfo();
        System.out.println("=======================================");
        book2.displayInfo();
    }
}
