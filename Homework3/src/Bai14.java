import javax.xml.soap.SAAJMetaFactory;
import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Các số chắn nhỏ hơn " + n + " là: ");
        for (int i = 2; i < n; i += 2)
            System.out.print(i + " ");
        System.out.println("");
        System.out.println("Các số lẻ nhỏ hơn " + n + " là: ");
        for (int j = 1; j < n; j += 2)
            System.out.print(j + " ");
    }
}
