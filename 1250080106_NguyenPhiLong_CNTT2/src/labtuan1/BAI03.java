
package labtuan1;
import java.util.Scanner;

public class BAI03 {
    
    public static void main(String[] args) {
        double oC;
        double oF;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap do F: ");
        oF = sc.nextDouble();
        
        oC = (oF-32)/1.8;
        
        System.out.println("do C tuong ung:"+oC);
    }
}
