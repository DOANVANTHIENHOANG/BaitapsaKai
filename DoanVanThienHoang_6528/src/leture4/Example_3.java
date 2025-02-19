
package leture4;

import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {
        Scanner id = new Scanner (System.in);
        System.out.print("Nhap so: ");
        int noi=id.nextInt();
        if(noi == 1){
            System.out.println("Gold medal!");
        }else if(noi == 2){
            System.out.println("Silver medal !");
        }else if (noi==3){
            System.out.println("Broze medal !");
        }
    }
}
