import java.sql.SQLOutput;
import java.util.Scanner;

public class dowhite {
    public static void main(String[] args) {
//        System.out.println("Nhập số nguyên dương n: ");
//        int n = new Scanner(System.in).nextInt();
//        int S = 0;
//        int i = 1;
//        do {
//            S = S + i;
//            i++;
//        } while (i <= n);
//        System.out.println("tổng là " + S);
//        for (int j = 0; true; j++) {
//            System.out.println("helo");
//        }
//        System.out.println("chiều dài");
//        int dai = new Scanner(System.in).nextInt();
//        for (int i = 0; true; i++) {
//            if (dai <= 0) {
//                System.out.println("nhập lại");
//                dai = new Scanner(System.in).nextInt();
//            }
//        }
        //số nguyên tố
        System.out.println("nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        if (n < 2) {
            System.out.println("Không phải là số nguyên tố");
            return; //đóng chương trình
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println("k là số nguyên tố");
            return;
        }
        System.out.println("là số nguyên tố");

    }
}


