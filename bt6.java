package saKai8;

import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner id = new Scanner (System.in);
        System.out.println("Nhap  so chuoi: ");
        String str = id.nextLine();
        System.out.println("Nhap tu can thay the: ");
        String oldword =id.nextLine();
        System.out.println("Nhap tu thay the: ");
        String newWord = id.nextLine();
        String result = str.replace(oldword, newWord);
        System.out.println("ket qua la: " + result);
    }
    
}
