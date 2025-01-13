package leture4;

import java.util.Scanner;

public class saKai6 {
    public static void main(String[] args) {
        Scanner  id = new Scanner (System.in);
        System.out.println("Nhap hoa don: ");
         int kWh = id.nextInt();
         double tong = 0;
         if(kWh <= 50){
             tong = kWh * 1.678;
         }else if(kWh <=100){
             tong = 50 * 1.678 + (kWh - 50) * 1.734;
             
    }else if(kWh <= 200){
        tong = 50 *1.678 + 50 * 1.734 + (kWh - 100) * 2.014;
    }else {
        tong = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + (kWh - 200) * 2.536;
    }
         System.out.println("Tong tieu thu "+ tong +" VND/kWh " );
    }   
}
