import java.lang.Math;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("a bằng: ");
        a = scanner.nextDouble();
        System.out.println("b bằng: ");
        b = scanner.nextDouble();
        System.out.println("c bằng: ");
        c = scanner.nextDouble();
        double delta = b * b - 4 * a * c;
        double x1 = (-b - Math.sqrt(delta)) / (2 * a);
        double x2 = (-b + Math.sqrt(delta)) / (2 * a);
        double x3 = -b / (2 * a);
        if (a == 0)
            System.out.println("Phương trình ax2 + bx + c = 0 có nghiệm duy nhất là:  " + -c / b);
        if (a != 0)
            if (delta > 0)
                System.out.println("Phương trình ax2 + bx + c = 0 có hai nghiệm phân biệt " + x1 + " và " + x2);
            if (delta == 0)
                System.out.println("Phương trình ax2 + bx + c = 0 có nghiệm kép là: " + x3);
            if (delta < 0)
                System.out.println("Phương trình ax2 + bx + c = 0 vô nghiệm");
    }
}