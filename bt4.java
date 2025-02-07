package saKai8;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner id = new Scanner (System.in);
        System.out.println("Nhap mot chuoi: ");
        String str = id.nextLine();
        String result = str.replaceAll("\\s+", " ");
        System.out.print("Chuoi sau khi bi loai bo:" + result);
    }
    
}
