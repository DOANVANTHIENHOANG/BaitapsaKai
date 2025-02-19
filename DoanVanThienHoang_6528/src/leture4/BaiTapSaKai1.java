package leture4;

import java.util.Scanner;

public class BaiTapSaKai1 {
    public static void main(String[] args) {
        Scanner kiemTra=new Scanner (System.in);
        System.out.println("Nhap so N: ");
        int so = kiemTra.nextInt();
        if(so%2==0){
            System.out.println(so +" la so chan");
        }else {
            System.out.println(so + "la so le");
        }
    }
    
}
