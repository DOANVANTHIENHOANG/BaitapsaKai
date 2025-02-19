package Baitap2;
public class saKai6 {
    public static void main(String[] args) {
        System.out.print("Tim so nguyen to tu 1 den 100: ");
        for(int i= 2;i<=100;i++){
            if(laNguyenTo(i)){
                System.out.print(i+",");
            }
    }
        System.out.println();
}
    public static boolean laNguyenTo (int n){
        if(n <=1){
            return false;
        }
        for(int i=2;i<= Math.sqrt(n);i++){
            if(n % i==0){
                return false;
            }
        }
        return true;
    }
}
