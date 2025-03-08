
package lecture11;

import java.util.Date;
import java.util.Scanner;

public abstract class Book  implements IBook{
    private String bookId;
    private String publisher;
    private Date entryDate;
    private double unitPrice;
    private double quantity;
    public Book(){
}
    public Book(String bookId,String publisher,Date entryDate,double unitPrice,double quantity){
        this.bookId = bookId;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    public abstract void addBook();
    public abstract void updateBook(String id);
    public abstract void displayBook();
    public abstract double calculateDiscount();
     public String getBookId() {
        return bookId;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public double getQuantity() {
        return quantity;
    }
}

