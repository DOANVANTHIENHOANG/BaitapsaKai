
package leture4;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = id.nextInt();
        if(x > 0){
            System.out.println("Poitive");
        }else if(x<0){
            System.out.println("Negative");
        }else {
            System.out.println("zero");
        }
    }
}
