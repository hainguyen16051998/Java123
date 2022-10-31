import java.util.Scanner;
import java.lang.Math;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        System.out.println("bán kính là : ");
        a = scanner.nextDouble();
        double b = Math.PI;
        double c = 2*a*b;
        double d = a*a*b;
        System.out.println("Chu vi cua hinh tron co ban kinh la 10  la " + c);
        System.out.println("Dien tich cua hinh tron co banh kinh la 10 la " + d);
    }
}

