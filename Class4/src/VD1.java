import java.util.Scanner;

public class VD1 {
    public static void main(String[] args) {
        System.out.println("Số thứ nhất: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Số thứ hai: ");
        int y = new Scanner(System.in).nextInt();
        System.out.println("Tổng 2 số là: " + tong(x,y));
    }

    public static int tong(int a, int b) {
        int tong = a + b;
        return tong;
    }
}

