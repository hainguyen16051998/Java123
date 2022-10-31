import java.util.Scanner;

public class DemoMethod {
    public static void main(String[] args) {
        /**
         * 1.Nhập chiều dài 2 cạnh
         * 2.tính toán hiển thị kết quả
         *
         */
        System.out.println("chieu dai ");
        int dai = new Scanner(System.in).nextInt();
        System.out.println("chieu rong ");
        int rong = new Scanner(System.in).nextInt();
        System.out.println("chu vi la " + 2 * (dai + rong));
    }

    /**
     * phương thức hàm tính chu vi của HCN khi biết 2 cạnh của nó
     */

    public int tinhchuviHCN(int dai, int rong) {
        int chuvi = (dai + rong) * 2;
        return chuvi;
    }

    // đây là 1 khối blockcode
    {
        System.out.println("kasjdkasjdkja");
        System.out.println(tinhchuviHCN(2,8));
    }
}
