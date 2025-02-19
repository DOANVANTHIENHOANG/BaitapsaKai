package Baitap2;

import java.util.Scanner;

public class saKai5 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int so = id.nextInt();
        if(so < 0){
            System.out.println("Vui long nhap lai");
        }else if(so == 0){
            System.out.println("chi co 1 chu so");
    }else{
            int dem =0;
            while (so >0){
                so /= 10;
               dem ++;
            }
            System.out.println("Dem duoc: " + dem + "so");
        }
}
}
