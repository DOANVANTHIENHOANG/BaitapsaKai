package saKai8;

import java.util.Scanner;

public class bt7 {
    public static void main(String[] args) {
        Scanner number = new Scanner (System.in);
        System.out.println("Nhap so chuoi ky tu: ");
        String str = number.nextLine();
        for(int i =0;i<str.length();i++){
            for(int j=0;j<9;j++){
                if(str.charAt(i)== (char)('0' + j))
                    System.out.print(j);
            }
        }
        
        
    }
}
