package leture4;

import java.util.Scanner;

public class saKai7 {
    public static void main(String[] args) {
        Scanner id = new Scanner (System.in);
        System.out.println("Nhap so nguyen to: ");
        int so = id.nextInt();
        if(nguyenTo(so)){
            System.out.println("la so nguyen to");
        }else {
            System.out.println("khong phai la so nguyen to");
        }
    }
    public static boolean nguyenTo(int n) {
        if(n <= 1){
            return false;
        }
        for (int i=2;i< Math.sqrt(n);i++){
            if(n%i==0){
             return false;   
            }
        }
        return true;
    }
}
