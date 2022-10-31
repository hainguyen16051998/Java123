import org.jcp.xml.dsig.internal.dom.DOMUtils;

import java.lang.Math;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        System.out.println("Nhập vào số thứ nhất: ");
        a = scanner.nextDouble();
        System.out.println("Nhập vào số thứ hai: ");
        b = scanner.nextDouble();
        double c = b/a;
        double d = (double) Math.round(c * 1000) / 1000;
        System.out.println(d);
    }
}
