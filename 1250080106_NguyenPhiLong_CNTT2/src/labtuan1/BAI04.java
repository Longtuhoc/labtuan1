
package labtuan1;
import java.util.Scanner;

public class BAI04 {
    
    public static void main(String[] args) {
        int year;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap nam:");
        year = sc.nextInt();
        
        if (year % 4 == 0 && (year % 100 !=0 || year % 400 == 0)) {
            System.out.println(year+" " + "la nam nhuan");
        } else {
            System.out.println(year+" " + "la nam khong nhuan");
            
        }
            
    }
}
