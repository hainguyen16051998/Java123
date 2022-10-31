import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        int x = m;
        int y = n;
        if (x == y) {
            System.out.println(m + " và " + n + " không phải hai số nguyên tố cùng nhau");
        } else {
            while (x != y) {
                if (x > y)
                    x = x - y;
                else
                    y = y - x;
            }
            if (x == 1)
                System.out.println(m + " và " + n + " là hai số nguyên tố cùng nhau");
            else
                System.out.println(m + " và " + n + " không phải hai số nguyên tố cùng nhau");
        }
    }
}

