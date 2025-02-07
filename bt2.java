package saKai8;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String str = scanner.nextLine().trim();
        if(str.isEmpty()){
            System.out.println("So tu trong chuoi: 0");
        }else{
        String[] words = str.trim().split("\\s+");
        System.out.println("Số từ trong chuỗi: " + words.length);
        }
    }
}
