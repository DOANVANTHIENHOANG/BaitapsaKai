package leture4;

import java.util.Scanner;

public class Sakai3 {
    public static void main(String[] args) {
        Scanner nam=new Scanner(System.in);
        System.out.println("Nhap nam: ");
        int namNhuan=nam.nextInt();
        if((namNhuan %4==0 && namNhuan %100 != 0) || namNhuan % 400==0){
        System.out.println(namNhuan+"la nam nhuan");
    }else {
            System.out.println(namNhuan+ "khong phai la nam nhuan");
            }
    }
    
}
