import sun.java2d.pipe.SpanShapeRenderer;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Duration;
import java.lang.String;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ngày sinh của bạn là (dd/MM/yyyy): ");
        String day1 = sc.next();
        DateTimeFormatter a =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDay = LocalDate.parse(day1,a);
        LocalDate now = LocalDate.now();
        Duration day = Duration.between(birthDay.atStartOfDay(), now.atStartOfDay());
        String Tuoi = birthDay.isAfter(now) ? "Bạn chưa có trên cõi đời này" : "Tuổi của bạn hiện tại là %i  : "+day.toDays()/365;
        System.out.println(Tuoi);
    }
}

