
package labtuan1;
import java.util.Scanner;

public class BAI09 {
    
    public BAI09(){
    }
    
    public static int tong(int n){
        int sum = 0;
        while (n>0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    public static int tich(int n){
        int product = 1;
        while (n>0){
            product *= n % 10;
            n /= 10;
        }
        return product;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap so nguyen: ");
        int so1 = sc.nextInt();
        
        System.out.println("tong cac chu so: " + tong(so1));
        System.out.println("tich cac chu so: " + tich(so1));
    }
}
