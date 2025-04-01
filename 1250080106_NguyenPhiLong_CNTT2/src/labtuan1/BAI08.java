
package labtuan1;
import java.util.Scanner;

public class BAI08 {
    int n;
    
    public BAI08(){
    }
    
    public static int timsocuoi(int n){
        return n % 10;
    }
    
    public static int timsodau(int n){
        while (n>=10){
            n/=10;
        }
        return n;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap so nguyen: ");
        int so1 = sc.nextInt();
        
        System.out.println("chu so dau tien: " + timsodau(so1));
        System.out.println("chu so tan cung: " + timsocuoi(so1));
    }
}
