package labtuan1;
import java.util.Scanner;

public class BAI13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String nhap = scanner.nextLine();
        
        String[] words = nhap.trim().split("\\s+");
        
        int dem = nhap.isEmpty() ? 0 : words.length;
        
        System.out.println("So tu trong chuoi la: " + dem);
        
    }
}