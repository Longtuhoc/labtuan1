
package labtuan1;
import java.util.Scanner;

public class BAI02 {
    
    public static void main(String[] args) {
        double chieudai;
        double chieurong;
        double dientich;
        String ten;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ten hinh: ");
        ten = sc.nextLine();
        
        System.out.print("nhap chieu dai: ");
        chieudai = sc.nextDouble();
        
        System.out.print("nhap chieu rong: ");
        chieurong = sc.nextDouble();
        
        dientich = chieudai * chieurong;
        
        System.out.println("Dien tich hinh chu nhat la: "+dientich);
    }
}
