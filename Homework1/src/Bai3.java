import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c,d;
        System.out.println("số thứ 1: ");
        a = scanner.nextDouble();
        System.out.println("số thứ 2: ");
        b = scanner.nextDouble();
        System.out.println("số thứ 3: ");
        c = scanner.nextDouble();
        System.out.println("số thứ 4: ");
        d = scanner.nextDouble();
        double max= (a>b) ? a : b;
        double max2=(max>c) ? max : c;
        double max3=(max2>d) ? max2 : d;
        System.out.println("số lớn nhất là " + max3);
    }
}
