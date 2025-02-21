package lecture10;

import java.util.Date;
import java.util.Scanner;

public class ReferenceBook extends Book {
    private String category;
    private double tax;   
   public ReferenceBook(String bookId,String publisher,Date entryDate,double unitPrice,double quantity,double tax){
       super(bookId, publisher,entryDate,unitPrice,quantity);
              this.tax = tax;
              this.category = category;
    }
    @Override
    public void addBook(){
        super.addBook();
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter catergory (RenfenceBook): ");
        this.category = scanner.nextLine();
        System.out.println("Enter tax: ");
        this.tax = scanner.nextDouble();
    }
    @Override
    public void displayBook(){
        super.displayBook();
        System.out.println("Category: " +this.category);
        System.out.println("Tax: " + this.tax);
    }
    
}
