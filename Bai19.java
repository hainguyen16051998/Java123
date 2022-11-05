
import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        int[] a = nhapmang();
        xuatmang(a);
        System.out.println("Số lớn nhất: "+max(a));
        System.out.println("Số nhỏ nhất: "+min(a));
    }

    public static int[] nhapmang() {
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static void xuatmang(int[] a) {
        System.out.println("----------------------");
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
                break;
            }
            System.out.print(a[i] + ", ");
        }
        System.out.println("]");
    }

    public static int max(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
    public static int min(int[] a){
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]){
                min = a[i];
            }
        }
        return min;
    }
}
