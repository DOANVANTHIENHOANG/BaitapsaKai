
package btmethod;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Car2 {
    public static void main(String[] args) {
        Scanner id = new Scanner (System.in);
        ArrayList<Car> Cars = new ArrayList<>();
        System.out.println("Nhap so luong xe: ");
        int n = id.nextInt();
        for(int i=0;i<n;i++){
        System.out.println("Nhap xe thu "+ (i+1) + ":");
        Car myCar = new Car();
        myCar.inputDetails(id);
       Cars.add(myCar);
    }
        
        System.out.println("\n Danhs sach da nhap: ");
for (Car car:Cars){
    car.displayDetails();
}}
}
