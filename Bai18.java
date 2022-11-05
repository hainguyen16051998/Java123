import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

public class Bai18 {
    public static void main(String[] args) {
        for (int i = 100000; i <= 999999; i++) {
            if (thuannghich(i) && chiahet10(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean thuannghich(int n) {
        int sobandau = n;
        int t = 0;
        while (n > 0) {
            t = t * 10 + n % 10;
            n = n / 10;
        }
        if (sobandau == t) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean chiahet10(int n) {
        int t;
        int dem = 0;
        while (n > 0) {
            t = n % 10;
            n = n / 10;
            dem += t;
        }
        if (dem % 10 == 0)
            return true;
        else
            return false;
    }
}
