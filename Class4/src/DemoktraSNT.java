import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class DemoktraSNT {
        public static void main(String[] args) {
            System.out.println("Nhập n: ");
            int x = new Scanner(System.in).nextInt();
        kiemtraSNT(x); // lời gọi hàm --> gọi thằng stra SNT lên để nó thực hiện nhiệm vụ của mình
    }

    public static void kiemtraSNT(int n) {

        if (n < 2) {
            System.out.println("n không là số nguyên tố");
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("không là SNT");
                return;
            }
        }
        System.out.println("là SNT");
    }
}

