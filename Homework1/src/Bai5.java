import java.lang.Math;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b;
        System.out.println("Cạnh góc vuông thứ nhất: ");
        a = scanner.nextDouble();
        System.out.println("Cạnh góc vuông thứ hai: ");
        b = scanner.nextDouble();
        double c=Math.sqrt(a*a+b*b);
        System.out.println("sinx là " + a/c);
        System.out.println("cosx là " + b/c);
    }
}
