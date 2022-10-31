import java.util.Scanner;
import  java.lang.String;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Hệ số a: ");
        a = scanner.nextInt();
        System.out.println("Hệ số b: ");
        b = scanner.nextInt();
        String ketqua = a != 0 ? ("có nghiệm x ="+(float)(-b)/a) : (b ==0 ?" có vô số nghiệm" : "vô nghiệm");
        System.out.printf("Phương trình %dx + %d = 0 %s",a,b,ketqua);
    }
}




