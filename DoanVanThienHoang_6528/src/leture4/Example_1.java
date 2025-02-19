
package leture4;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
       
    Scanner id = new Scanner(System.in);
        System.out.print("What percentage did you earn: ");
        int neu= id.nextInt();
        if(neu >= 90){
            System.out.println("bạn chon vao A");
        }
        else if(neu >=80){
            System.out.println("Ban chon vao B");
        }else if(neu >=70){
            System.out.println("Bạn chon vao C");
        }else if(neu >=60){
            System.out.println("Ban chon vao D");
        }else {
            System.out.println("Ban chon vao F");
        }
    } 
}
