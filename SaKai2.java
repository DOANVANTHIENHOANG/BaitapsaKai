package leture4;

import java.util.Scanner;
public class SaKai2 {
    public static void main(String[] args) {
        Scanner so = new Scanner (System.in);
        System.out.println("Nhap diem toan: ");
        double a =so.nextDouble();
        System.out.println("Nhap diem vat li: ");
        double b =so.nextDouble();
        System.out.println("Nhap diem Hoa hoc: ");
        double c = so.nextDouble();
        double diemTrungBinh = (a +  b + c) /3;
        if(diemTrungBinh >= 8){
            System.out.println("Diem xuat sac");
        }else if(diemTrungBinh >= 6.5 && diemTrungBinh <8 ){
            System.out.println("Kha");
        }else if(diemTrungBinh >= 5 && diemTrungBinh < 6.5){
            System.out.println("Trung Binh");
        }else if(diemTrungBinh <5){
            System.out.println("yeu");
        }
    }
}
