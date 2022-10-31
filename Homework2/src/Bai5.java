import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chuỗi ký tự: ");
        String a, b, d, e;
        a = sc.nextLine();
        System.out.print("Ký tự cần tìm: ");
        b = sc.next();
        int c = a.indexOf(b);
        String ketqua = c < 0 ? "Không tìm thấy ký tự trong chuỗi" : "Vị trị ký tự đầu tiên: " + (a.indexOf(b) + 1) + "\nVị trí ký tự cuối cùng: " + (a.lastIndexOf(b) + 1);
        System.out.println(ketqua);
        System.out.print("Nhập chuỗi bất kỳ : ");
        sc.nextLine();
        a = sc.nextLine();
        System.out.print("Nhập chuỗi cần tìm s1: ");
        d = sc.nextLine();
        System.out.print("Nhập chuỗi thay thế s2: ");
        e = sc.nextLine();
        c = a.indexOf(e);
        ketqua = c < 0 ? "Không tìm thấy chuỗi s1" : "Kết quả chuỗi mới: " + a.replace(d, e);
        System.out.println(ketqua);
    }
}
