import java.util.Scanner;
public class Bai8 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        b = scanner.nextInt();
        System.out.println("Nhập vào số thứ ba: ");
        c = scanner.nextInt();
        if(a>=b && a>=c)
            System.out.println("số lớn nhất là " + a);
        if(b>=a && b>=c)
            System.out.println("số lớn nhất là " + b);
        if(c>=a && c>=b)
            System.out.println("số lớn nhất là " + c);
    }
}
