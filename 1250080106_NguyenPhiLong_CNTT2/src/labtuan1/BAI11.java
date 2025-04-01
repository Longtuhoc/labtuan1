package labtuan1;
import java.util.Scanner;

public class BAI11 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Nhập số nguyên: ");
        int n = sc.nextInt();
        int r = 0;
        
        while (n != 0){
            r = r * 10 + n % 10;
            n /= 10;
        }
        
        System.out.println("so dao nguoc: "+ r);
    }
}

