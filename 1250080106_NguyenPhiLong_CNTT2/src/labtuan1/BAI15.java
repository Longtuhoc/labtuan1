package labtuan1;
import java.util.Scanner;

public class BAI15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay : ");
        String date = sc.nextLine().trim();

        String[] parts = date.split("/");

        if (parts.length != 3) {
            System.out.println("Sai dinh dang! Vui long nhap dung ");
            return;
        }

        System.out.println("Ngay: " + parts[0]);
        System.out.println("Thang: " + parts[1]);
        System.out.println("Nam: " + parts[2]);
    }
}
