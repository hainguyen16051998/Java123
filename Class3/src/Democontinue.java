import java.util.Scanner;

public class Democontinue {
    public static void main(String[] args) {
        // S=2+4+6+8+...
        System.out.println("nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        for (int i = 0; i <= 0; i++) {
            if (i % 2 != 0) {
                continue;
            }
            S += i;
            System.out.println(i);
        }
        System.out.println(S);
    }
}
