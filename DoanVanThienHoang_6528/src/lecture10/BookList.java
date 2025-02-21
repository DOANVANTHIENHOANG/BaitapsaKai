package lecture10;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book> books;
    public BookList(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added successfully");
    }
    public Book updateBook(String id){
        for(Book book : books){
            if(book.getBookId().equals(id)){
                return book;
            }
        }
        return null;
    }
    public void displayAllBooks(){
        if(books.isEmpty()){
            System.out.println("No books avaiable");
        }else{
            for(Book book : books){
                book.displayBook();
            }
        }
    }

    void deleteBookById(String deleteId) {
        for(int i =0 ;i< books.size();i++){
            Object bookId = null;
            if(books.get(i).getBookId().equals(bookId)){
                books.remove(i);
                System.out.println("Book with ID" +bookId + "has been deleted");
               
            }
    }
    }

    public Book findBookById(String searchId) {
      for(Book book : books){
          if(book.getBookId().equals(searchId)){
              return book;
          }
      }
        System.out.println("Book witch ID " + searchId +"not sound");
        return null;
    }  
}
