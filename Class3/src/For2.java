import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên dương n: ");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        for (int i = 1; i <= n; i++) {
            if (n % 2 == 0) {
                S = S + 2 * n;
            }
        }
        System.out.println("Tổng là " + S);
        System.out.println("--------------------------");
        int j = 0;
        int S1 = 0;
        while (j <= n) {
            j += 2;
            S1 += j;
        }
            System.out.println("tổng là " +S1);
    }

}



