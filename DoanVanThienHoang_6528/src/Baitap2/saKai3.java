package Baitap2;

import java.util.Scanner;

public class saKai3 {
    public static void main(String[] args) {
        Scanner so = new Scanner (System.in);
        System.out.println("Nhap so tu nhien: ");
        int giai = so.nextInt();
        if(giai <0){
            System.out.print("Vui long nhap lai");
    }else {
            long giaiThua = 1;
            for(int i=1;i<= giai;i++){
                giaiThua *= i;
            }
            System.out.println("Factorial = " + giaiThua);
        }
}
}
