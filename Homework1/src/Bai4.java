import java.lang.Math;
import java.util.Scanner;

public class Bai4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double a;
            System.out.println("số cần khai căn : ");
            a = scanner.nextDouble();
            double b = Math.sqrt(a);
            double c = (double) Math.round(b*1000)/1000;
            System.out.println("kết quả là: "+c);
        }
}
