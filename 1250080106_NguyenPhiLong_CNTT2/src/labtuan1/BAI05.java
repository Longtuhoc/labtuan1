
package labtuan1;
import java.util.Scanner;
 
public class BAI05 {
    
    public static void main(String[] args) {
        double so1;
        double so2;
        double so3;
        double min;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        so1 = sc.nextDouble();

        System.out.print("Nhap so thu hai: ");
        so2 = sc.nextDouble();

        System.out.print("Nhap so thu ba: ");
        so3 = sc.nextDouble();

        min = Math.min(so1, Math.min(so2, so3));

        System.out.println("Gia tri nho nhat la: " + min);
    }
}
