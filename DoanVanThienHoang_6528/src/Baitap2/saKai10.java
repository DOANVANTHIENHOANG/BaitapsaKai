package Baitap2;

import java.util.Scanner;

public class saKai10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int so = id.nextInt();
        if(so <= 0){
            System.out.println("Vui long nhap lai");
        }else {
            for(int i=1;i<= so;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}
