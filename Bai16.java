import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Các só chẵn bé hơn " + n + " là: ");
        System.out.println(chan(n));
        System.out.println("");
        System.out.println("Các só lẻ bé hơn " + n + " là: ");
        System.out.println(+le(n));
    }

    public static int chan(int n) {
        for (int i = 2; i < n; i += 2) {
            System.out.print(i + " ");
        }
        return 0;
    }


    public static int le(int n) {
        for (int i = 1; i < n; i += 2) {
            System.out.print(i + " ");
        }
        return 0;
    }

}
