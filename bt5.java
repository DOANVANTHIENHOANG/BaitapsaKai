package saKai8;

import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner id = new Scanner (System.in);
        System.out.println("Nhap mot chuoi: ");
        String str = id.nextLine();
        System.out.println("Nhap vao mot ky tu: ");
        char ch = id.next().charAt(0);
        int dem =0;
        for(char c: str.toCharArray()){
            if(c == ch){
                dem ++;
            }
        }
        System.out.println("so lan xuat hien cua " + ch +" trong chuoi: "+dem);
    }
}
