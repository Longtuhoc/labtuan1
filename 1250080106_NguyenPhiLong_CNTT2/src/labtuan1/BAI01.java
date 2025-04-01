
package labtuan1;
import java.util.Scanner;

public class BAI01 {

    public static void main(String[] args) {
        String name;
        String ngaysinh;
        String mssv;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ho va ten: ");
        name = sc.nextLine();
        
        System.out.print("ngay sinh: ");
        ngaysinh = sc.nextLine();
        
        System.out.print("ma so sinh vien: ");
        mssv = sc.nextLine();
        
        System.out.println("ten cua ban la:"+name);
        System.out.println("ngay sinh:"+ngaysinh);
        System.out.println("mssv:"+mssv);
    }
    
}
