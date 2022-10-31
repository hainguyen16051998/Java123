import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b;
        System.out.println("Chiều dài là : ");
        a = scanner.nextDouble();
        System.out.println("Chiều rộng là : ");
        b = scanner.nextDouble();
        double c = 2*(a+b);
        double d = a*b;
        System.out.println("Chu vi hình chữ nhật có chiều dài là " +a+ ", Chiều rộng là  " +b+ " là " + c);
        System.out.println("Diện tích hình chữ nhật có chiều dài là" +a+ " Chiều rộng " +b+ " là " + d);
    }
}
