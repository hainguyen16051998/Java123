import java.util.Scanner;
import java.lang.Math;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b;
        System.out.println("Chiều dài là : ");
        a = scanner.nextDouble();
        System.out.println("Chiều rộng là : ");
        b = scanner.nextDouble();
        System.out.println("Chu vi hình chữ nhật là: " + 2*(a+b));
        System.out.println("Diện tích hình chữ nhật là:" + a*b);
    }
}
