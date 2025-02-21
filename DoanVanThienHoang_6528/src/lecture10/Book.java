
package lecture10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Book implements IBook{
  private String bookId;
   private String publisher;
    private Date entryDate;
    private double unitPrice;
    private double quantity;
    public Book(String bookId, String publisher, Date entryDate, double unitPrice, double quantity){
        this.bookId = bookId;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    @Override
    public void addBook(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("ID: ");
        bookId = scanner.nextLine();
        System.out.println("publisher: ");
        publisher = scanner.nextLine();
        System.out.println("entryDate: ");
        this.entryDate = new Date();
        System.out.println("unitPrice: ");
        unitPrice = scanner.nextDouble();
        System.out.println("quantity: ");
        quantity = scanner.nextDouble();
        
    }
   public String getBookId(){
       return bookId;
   }
    @Override
    public void updateBook(String id){
        if(!this.bookId.equals(id)){
            System.out.println("Book Id does not match, update aborted!");
            return;
        }
        Scanner scanner = new Scanner (System.in);
        System.out.println("Updating Book ( Id: " + id + "):");
        System.out.println("New Publisher (leave empty to skip): ");
        String newPublisher = scanner.nextLine();
        if(!newPublisher.isEmpty()){
            this.publisher = newPublisher;
        }
        System.out.println("New date(dd/MM/yyyy) (leave empty  to skip): ");
        String dateStr = scanner.nextLine();
        if(!dateStr.isEmpty()){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try{
                this.entryDate = sdf.parse(dateStr);
            }catch (ParseException e){
                System.out.println("Invaid date format,Skipping date update");
            }
        }
        System.out.println("New unit price (enter -1 to skip): ");
        double newPrice = scanner.nextDouble();
        if(newPrice >= 0){
            this.unitPrice = newPrice;
        }
        System.out.println("New quality (enter -1 to slip): ");
        double newQty = scanner.nextDouble();
        if(newQty >= 0){
            this.quantity = newQty;
        }
        System.out.println("Book information has been update!");
    }
    @Override
    public void displayBook(){
        System.out.println("displayBook");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = (entryDate != null) ? sdf.format(entryDate) : "N/A";
        System.out.println("=== Book information ===");
        System.out.println("ID: " + bookId);
        System.out.println("Publisher: " + publisher);
        System.out.println("Entry Date: " + dateString );
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
    }
   
}
