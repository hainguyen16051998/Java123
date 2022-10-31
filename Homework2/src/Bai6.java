import java.util.Scanner;
import java.lang.Math;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        System.out.println("Bán kính là : ");
        a = scanner.nextDouble();
        System.out.println("Diện tích hình tròn là: " + Math.PI*a*a);
    }
}
