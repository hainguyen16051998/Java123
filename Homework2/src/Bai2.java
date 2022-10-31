import java.util.Scanner;
import java.lang.Math;

public class Bai2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hệ số a : ");
        a = sc.nextInt();
        System.out.print("Hệ số b: ");
        b = sc.nextInt();
        System.out.print("Hệ số c: ");
        c = sc.nextInt();
        float delta = b*b-4*a*c;
        String ketqua = delta<0 ? "vô nghiệm" : delta==0 ? "có nghiệm kép " + (float) -b/(2*a) : "có 2 nghiệm phân biệt "
                + (float) (-b-Math.sqrt(delta))/(2*a) + " và " + (float) (-b+Math.sqrt(delta))/(2*a);
        System.out.println("Phương trình " + ketqua);
    }
}