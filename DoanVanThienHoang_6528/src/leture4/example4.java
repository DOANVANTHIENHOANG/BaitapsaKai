
package leture4;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner id = new Scanner (System.in);
        System.out.print("Nhap so N: ");
        int so = id.nextInt();
        switch(so){
            case 5 :System.out.print("5 \n"); break;
            case 4 : System.out.print("4 \n"); break;
            case 3 : System.out.print("3 \n"); break ;
            case 2 : System.out.print("2 \n");break;
            case 1 : System.out.print("1 \n"); break;
            default : System.out.print("No \n");
        }
            
//        if(so>=1 && so <= 5){
//            System.out.println(so);
//        }else {
//            System.out.println("vui long nhap lai!");
//        }
    }
}
