package Baitap2;

import java.util.Scanner;
import java.util.Arrays;

public class saKai8 {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.println("Nhap so luong: ");
        int so = in.nextInt();
        int [] arr = new int[so];
        System.out.println("Nhap cac phan tu cua mang: ");
        for(int i = 0;i<so;i++){
            arr[i]= in.nextInt();
        }
        int lon = arr[0];
        for(int i=1;i<so;i++){
            if(arr[i]>lon){
                lon = arr[i];
        }
    }
        System.out.println("Mang: " + Arrays.toString(arr));
        System.out.println("So lon nhat = " + lon);
    }
    
}
