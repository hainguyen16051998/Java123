import java.util.Scanner;

public class DemoArr02 {
    public static void main(String[] args) {
        System.out.println("nhập số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] =");
            arr[i] = new Scanner(System.in).nextInt();
        }
//        System.out.println("-------------------");
//        int S = 0;
//        for (int i = 0; i < arr.length; i++) {
//            S += arr[i];
//        }
//        System.out.println(S);
        System.out.println("-------------------");
        float S=0;
        for (int i = 0; i < arr.length; i++) {
            S += arr[i];
        }
        System.out.println("Trung bình cộng là: "+S/arr.length);
    }
}

