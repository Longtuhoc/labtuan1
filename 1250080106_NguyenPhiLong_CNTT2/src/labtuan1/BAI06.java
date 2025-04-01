
package labtuan1;
import java.util.Scanner;

public class BAI06 {
    
    public static void main(String[] args) {
        String ten;
        double a;
        double b;
        double c;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ten hinh: ");
        ten = sc.nextLine();
        
        System.out.print("nhap canh a:");
        a = sc.nextDouble();
        
        System.out.print("nhap canh b:");
        b = sc.nextDouble();
        
        System.out.print("nhap canh c:");
        c = sc.nextDouble();
        
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("tam giac hop le");
        } else {
            System.out.println("tam giac khong hop le");
            
        }
    }
}
