
package lecture10;

import java.util.Date;
import java.util.Scanner;

public class Processor {
     public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
         BookList bookList = new BookList();
         while (true){
             System.out.println("0.Exit"
                     + "\n1.Add new book"
                     + "\n2. Update book by ID"
                     + "\n3. Delete book by ID"
                     + "\n4. Find book by ID"
                     + "\n5. Display all books"
                     + "\nChoose an option: ");
             int choice = scanner.nextInt();
             switch (choice){
                 case 1: 
                     System.out.println("Enter book ID: ");
                    String bookId = scanner.nextLine();
                    
                    System.out.println("Enter publisher: ");
                    String publisher = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Enter price: ");
                    double unitPrice = scanner.nextDouble();
                     scanner.nextLine();
                    System.out.println("Enter quantity: ");
                    double quantity = scanner.nextDouble();
                    
                    scanner.nextLine();
                    System.out.print("Choose book type (1. Textbook, 2. Reference Book): ");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    if (type == 1) {
                        System.out.print("Enter status: ");
                        String status = scanner.nextLine();
                 Date entryDate = null;
                       bookList.addBook(new TextBook(bookId,publisher,entryDate,unitPrice,quantity,status));
                    } else {
                        System.out.print("Enter tax: ");
                        double tax = scanner.nextDouble();
                 Date entryDate = null;
                         bookList.addBook(new ReferenceBook(bookId,publisher,entryDate,unitPrice,quantity,tax));
                    
                    }
                    break;

                case 2:
                    System.out.print("Enter book ID to update: ");
                    String updateId = scanner.nextLine();
                    bookList.updateBook(updateId);
                    break;

                case 3:
                    System.out.print("Enter book ID to delete: ");
                    String deleteId = scanner.nextLine();
                    bookList.deleteBookById(deleteId);
                    break;

                case 4:
                    System.out.print("Enter book ID to find: ");
                    String searchId = scanner.nextLine();
                    Book foundBook = bookList.findBookById(searchId);
                    if (foundBook != null) {
                        foundBook.displayBook();
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 5:
                    System.out.println("\nBook List:");
                    bookList.displayAllBooks();
                    break;

                case 0:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
                     
             }
         }
    }
}
