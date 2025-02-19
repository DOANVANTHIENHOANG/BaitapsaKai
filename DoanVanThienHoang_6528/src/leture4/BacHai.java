package leture4;

import java.util.Scanner;

public class BacHai {
    public static void main(String[] args) {
        Scanner so = new Scanner (System.in);
        System.out.println("Nhap a: ");
        double a = so.nextDouble();
        System.out.println("Nhap b: ");
        double b = so.nextDouble();
        System.out.println("Nhap c: ");
        double c = so.nextDouble();
         if(a==0){
             if(b==0){
                 if(c==0){
                     System.out.println("Phuong trinh co vo so nghiem");     
                 }else {
                     System.out.println("Phuong trinh vo nghiem");
                 }
         }else {
                 double x = -c/b;
                 System.out.println("Phuong trinh co mot nghiem x= " + x);
             }
        
    }else {
             double denta = b*b - 4 * a * c;
             if(denta<0){
                 System.out.println("Phuong trih vo nghiem");
             }else if(denta == 0){
                 double x = -b/(2*a);
                 System.out.println("Phuong trinh co mot nghiem x = " + x);
             }else {
                 double x1 = (-b + Math.sqrt(denta)/(2*a));
                 double x2 = (-b + Math.sqrt(denta)/(2*a));
                 System.out.println("Phuong trinh co hai ngiem phan biet");
                 System.out.println("x1 =" + x1);
                 System.out.println("x2 = " + x2);
             }
         }
         }
    
//    public static double phepCong(double a,double b) {
//        return a+b;}
//     public static double phepTru(double a,double b){
//    return a - b;
//        
//    }
//     public static double phepNhan (double a,double b) {
//         return a*b;
//        
//    }
//     public static double phepChia(double a,double b) {
//         return a/b;
//        
//    }
//     public static double chiaSoDu(double a,double b) {
//         return a%b;
//        
//    }
//    public static void main(String[] args) {
//        Scanner so= new Scanner (System.in);
//        System.out.print("Nhap so thu a: ");
//        double a = so.nextDouble();
//        System.out.print("Nhap so thu b: ");
//        double b = so.nextDouble();
//        double x1 = phepCong(a,b);
//        System.out.println("Phep Cong: "+x1);
//        double x2 = phepTru(a,b);
//        System.out.println("Phep Tru: " + x2);
//        double x3 = phepNhan(a,b);
//        System.out.println("Phep Nhan: " + x3);
//        double x4 = phepChia(a,b);
//        System.out.println("Phep chia: " + x4);
//        double x5 = chiaSoDu(a,b);
//           System.out.println("Phep chia lay so du: " + x5);
        }
                
//    }
    
