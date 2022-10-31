import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Số nguyên dương thứ nhất là : ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Số nguyên dương thứ hai là : ");
        int b = new Scanner(System.in).nextInt();
        int x = a;
        int y = b;
        int m, n;
        while (x != y) {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }
        m = x;
        n = (a * b) / m;
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + m);
        System.out.println("Bội chung nhỏ nhất của " + a + " và " + b + " là: " + n);
    }
}
