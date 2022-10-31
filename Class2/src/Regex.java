import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Regex {
    public static void main(String[] args) {
        String a = "B14DCCN340";
        String regex = "^[BN]\\d{2}(DC|CC|LT)(CN|VT|AT|MR)\\d{3}$";
        System.out.println(a.matches(regex));

        int b=5;
        Integer a1 = new Integer(5);
        Integer a2 = 5;
        Integer a3 = null;
        System.out.println(b);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);


    }
}
