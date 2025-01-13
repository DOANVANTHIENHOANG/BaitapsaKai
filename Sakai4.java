package leture4;

import java.util.Scanner;

public class saKai5 {
    public static void main(String[] args) {
        Scanner lon = new Scanner (System.in);
        System.out.println("Nhap 3 so: ");
        int a = lon.nextInt();
        int b = lon.nextInt();
        int c = lon.nextInt();
        if(a>b && a>c){
            System.out.println("so lon nhat la: " + a);
        }else if(b>c && b>a){
            System.out.println("so lon nhat la: " + b);
        }else if(c>a && c>b){
            System.out.println("so lon nhat la: " + c);
        }else if(a==b || c==a || b==c){
            System.out.println("Khong co cai nao lon hon");
        }
    }
}
