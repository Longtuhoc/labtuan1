package labtuan1;
import java.util.Scanner;

public class BAI12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int n = sc.nextInt(), r = 0, m = n;

        while (m != 0) {
            r = r * 10 + m % 10;
            m /= 10;
        }

        System.out.println(n == r ? "Doi xung" : "Khong doi xung");
    }
}
