
package lecture11;

import java.util.Date;

 abstract class TextBook extends Book {
    private String status;
    public TextBook(String bookId,String publisher,Date  entryDate,double unitPrice,double quantity){
        super (bookId,publisher,entryDate,unitPrice,quantity);
        this.status = status;
    }
    public double caltulateDiscount (){
        if(status.equalsIgnoreCase("new")){
            return getQuantity() * getUnitPrice() * 0.1;
        }else{ 
            return getQuantity() * getUnitPrice() * 0.5;
        }
    }
    @Override
    public void addBook(){
    }
    @Override
        public void updateBook(String id){}
        @Override
        public void displayBook(){
            System.out.println("TextBook ID: " + getBookId() + ",Status: " +status);
    }
        public double calcultateTotal(){
        return getQuantity() * getUnitPrice() - calculateDiscount();
 }
}
