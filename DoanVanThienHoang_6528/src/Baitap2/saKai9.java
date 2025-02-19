package Baitap2;

import java.util.Scanner;

public class saKai9 {
    public static void main(String[] args) {
        Scanner id = new Scanner (System.in);
        System.out.println("nhap nguyen duong: ");
        int so = id.nextInt();
        if(so <0){
            System.out.println("Vui long nhap lai");
        }else{
            boolean soDoiXung=soDoiXung(so);
            System.out.println("phai so doi xung khong ?" + (soDoiXung ? " Co":" Khong" ));
        }
    }
    public static boolean soDoiXung(int n) {
        int soDaoNguoc =0;
        int temp = n;
        while (temp>0){
            soDaoNguoc = soDaoNguoc *10 + temp %10;
            temp /=10;
        }
        return n==soDaoNguoc;
    }
}

