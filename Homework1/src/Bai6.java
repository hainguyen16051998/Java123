import java.util.Scanner;


public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        System.out.println("Nhập vào số thứ nhất: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        b = scanner.nextInt();
        double c = -b/a;
        if (a==0) {
            if(b==0)
                System.out.println("Phương trình " + a + "x +" + b + " = 0 có vô số nghiệm");
            if(b!=0)
                System.out.println("Phương trình " + a + "x +" + b + " = 0 vô nghiệm");
        }
        if (a!=0)
            System.out.println("Phương trình " + a + "x +" + b + " = 0 có nghiệm là " + c );
        }
    }
