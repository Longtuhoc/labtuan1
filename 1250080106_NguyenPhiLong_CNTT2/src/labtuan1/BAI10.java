package labtuan1;
import java.util.Scanner;


public class BAI10 {
    public static int count(int n){
        int count = 0;
        
        if(n==0){
            return 1;
        }
        
        while (n!=0){
            n /= 10;
            count++;
        }
        return count;
    }
    
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        
        System.out.print("nhap so nguyen: ");
        int so1 = sc.nextInt();
        
        System.out.println("co bao nhieu so trong cac so nguyen: " + count(so1));
    }
      
}