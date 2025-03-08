
package lecture10;

import java.util.Date;
import java.util.Scanner;

public class TextBook extends Book {
    private String status;
   
    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, String status) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }

   
    @Override
    public void addBook(){
        super.addBook();
        System.out.println("Enter status (TextBook): ");
        Scanner scanner = new Scanner(System.in);
        this.status = scanner.nextLine();
    }
    @Override
    public void displayBook(){
        super.displayBook();
        System.out.println("Status: " + status);
        System.out.println("Total Price: " + calculateTotal());
    }
    public double calculateDiscount(){
        if(status.equalsIgnoreCase("new")){
            return getQuantity() * getUnitPrice() * 0.1;
            
        }else if(status.equalsIgnoreCase("old")){
            return getQuantity() * getUnitPrice() * 0.5;
        }
        return 0;
    }
    @Override
    public double calculateTotal() {
         return (getQuantity() * getUnitPrice())- calculateDiscount();
    }
}

