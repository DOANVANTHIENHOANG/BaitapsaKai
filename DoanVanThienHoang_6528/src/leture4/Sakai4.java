package leture4;

import java.util.Scanner;

public class Sakai4 {
    public static void main(String[] args) {
        Scanner N = new Scanner (System.in);
        System.out.println("Nhap ngay trong tuan: ");
        int ngay=N.nextInt();
        switch(ngay){
            case 7: System.out.print("thu bay \n"); break;
            case 6: System.out.print("thu sau \n "); break;
            case 5: System.out.print("thu nam \n "); break;
            case 4: System.out.print("thu bon \n"); break;
            case 3: System.out.print("thu ba \n "); break;
            case 2: System.out.print("thu hai \n "); break;
            case 1: System.out.print(" Chu nhat \n"); break;
            default : System.out.print("Not \n");
    }
}
}
