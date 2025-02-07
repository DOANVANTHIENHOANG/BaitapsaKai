package saKai8;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner is = new Scanner (System.in);
        System.out.println("Nhap mot chuoi: ");
        String str = is.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Chuoi dao nguoc: " + reversed);
    }
}
