import java.lang.Math;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Hệ số: ");
        a = scanner.nextDouble();
        System.out.println("Số mũ: ");
        b = scanner.nextDouble();
        c = Math.pow(a, b);
        System.out.println(a + "^" + b + " = " + c);
    }
}

