package btmethod;
import java.util.Scanner;
public class Car {
    private String model;
    private int year;
    public Car() {}
    public Car (String model,int year){
        this.model = model;
        this.year = year;
    }
       public void inputDetails(Scanner id) {
        System.out.println("Nhap model xe: ");
        this.model = id.next();
        id.nextLine();
        System.out.println("Nhap nam san xuat: ");
        this.year = id.nextInt();
    }
    public void displayDetails(){
        System.out.println("Car model: " + model +",Year: " + year);
    }
}

