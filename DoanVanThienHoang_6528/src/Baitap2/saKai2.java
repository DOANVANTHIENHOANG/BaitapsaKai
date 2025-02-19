package Baitap2;

import java.util.Scanner;

public class saKai2 {
    public static void main(String[] args) {
        Scanner id = new Scanner (System.in);
        System.out.println("Nhap so tu nhien: ");
        int so = id.nextInt();
        long tong = 0;
        for(int i=0;i<=so;i++){
            tong += i;
    }
        System.out.println("Sum ="+ tong);
}
}
