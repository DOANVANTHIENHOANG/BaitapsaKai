package Baitap2;

import java.util.Scanner;

public class saKai7 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = id.nextInt();
        if(n <=0){
            System.out.println("Vui long nhap lai");
        }
            long a = 0, b =1;
            System.out.print(a+",");
            if(n >1){
                System.out.print(b+",");
            }
          for(int i=2;i <n;i++){
             long temp = a+b;
            System.out.print(temp + ",");
              a =b;
              b= temp;
    }
          System.out.println();
}
}


