
package labtuan1;
import java.util.Scanner;

public class BAI07 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap diem mon Ly: ");
        double ly = sc.nextDouble();
        
        System.out.print("nhap diem mon Hoa: ");
        double hoa = sc.nextDouble();
        
        System.out.print("nhap diem mon Sinh: ");
        double sinh = sc.nextDouble();
        
        System.out.print("nhap diem mon Toan: ");
        double toan = sc.nextDouble();
        
        System.out.print("nhap diem mon May Tinh: ");
        double maytinh = sc.nextDouble();
        
        double tlpt = ((ly + hoa + sinh + toan + maytinh)/50)*100;
        System.out.println("Ty le phan Tram: " + tlpt + "%");
        
        if(tlpt > 90){
            System.out.println("xep hang A");
        }else if (tlpt > 80 && tlpt < 90){
            System.out.println("xep hang B");
        }else if (tlpt > 70 && tlpt <80){
            System.out.println("xep hang C");
        }else if (tlpt > 60 && tlpt < 70){
            System.out.println("xep hang D");
        }else if (tlpt > 40 && tlpt <60){
            System.out.println("xep hang E");
        }else {
            System.out.println("xep hang F");
        }
        
    }
    
}
