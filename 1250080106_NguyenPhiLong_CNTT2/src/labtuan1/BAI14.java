package labtuan1;
import java.util.Scanner;

public class BAI14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String fullName = sc.nextLine().trim();

        String[] parts = fullName.split("\\s+"); 

        if (parts.length < 2) {
            System.out.println("Vui long nhap đay đu ho va ten!");
            return;
        }

        String ho = parts[0]; 
        String ten = parts[parts.length - 1]; 
        String tenDem = String.join(" ", java.util.Arrays.copyOfRange(parts, 1, parts.length - 1));

        System.out.println("Ho: " + ho);
        System.out.println("Ten dem: " + (tenDem.isEmpty() ? "(Khong co)" : tenDem));
        System.out.println("Ten: " + ten);
    }
}
