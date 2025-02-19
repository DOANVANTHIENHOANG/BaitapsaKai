package Baitap2;

import java.util.Scanner;

public class saKai4 {
    public static void main(String[] args) {
        Scanner id = new Scanner (System.in);
        System.out.println("Nhap day so: ");
        int so = id.nextInt();
        if(so < 0){
            System.out.println("Vui long nhap lai");
        }else {
            int soDaoNguoc=0;
            int temp = so;
            while (so >0){
            soDaoNguoc = soDaoNguoc * 10 + so %10;
            so /= 10;
        }
            System.out.println("so ban dau : "+ temp);
            System.out.println("so dao nguoc: " + soDaoNguoc);
        }
    }
}
