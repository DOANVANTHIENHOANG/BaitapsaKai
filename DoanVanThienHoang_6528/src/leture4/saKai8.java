package leture4;

import java.util.Scanner;

public class saKai8 {
    public static void main(String[] args) {
        Scanner tam = new Scanner (System.in);
        System.out.print("Nhap 3 canh: ");
        double a = tam.nextDouble();
        double b = tam.nextDouble();
        double c = tam.nextDouble();
        if(a+b > c || a+c > b || b+c > a){
            System.out.println(" tao thanh mot tac giac");
        }else {
            System.out.println("3 canh khong tao thanh mot tam giac");
            return;
        }
        
        if(a==b && b==c){
            System.out.println("Tam giac deu");
        }else if(a==b||b==c||c==a){
            System.out.println("Tam giac can");
        }else {
            System.out.println("tam giac khong deu");
    }
        tam.close();
    }
}

