package lecture10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookList {
    private final List<Book> bookList;
    private Book book;
    public BookList(){
        bookList = new ArrayList<>();
    }
    public void addBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book type (1: Textbook , 2: refencebook): " );
        int type = scanner.nextInt();
        scanner.nextLine();
        Book book;
        if(type == 1){
          book = new TextBook();
          
        }else if(type == 2) {
          book = new ReferenceBook();
       
        }else{
            System.out.println("Invalid book type!");
            return;
        }
        book.addBook();;
        bookList.add(book);
        System.out.println("Book added successfully!");
        }
    public void updateBook(String id){
        for(Book book : bookList){
            if(book.getBookId().equals(id)){
                book.updateBook(id);
                System.out.println("Book updated successfully!");
                return;
            }
        }
        System.out.println("Book not found !");
    }
    public void deleteBookById(String id){
        for(int i =0;i<bookList.size(); i++){
            if(bookList.get(i).getBookId().equals(id)){
                bookList.remove(i);
                System.out.println("Book deleted successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }
    public Book findBookById(String id){
        for(Book book : bookList){
            if(book.getBookId().equals(id)){
                return book;
    }
        }
        return null;
}
    public double calculateTotalAmount(){
        double total = 0;
        for(Book book : bookList){
            total += book.calculateTotal();
        }
        return total;
    }
    public void displayAllBooks(){
        if(bookList.isEmpty()){
            System.out.println("No books avaiable");
            return;
    }
        for(Book book : bookList){
            book.displayBook();
        }
}
}