import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDate {
    public static void main(String[] args) {

        String day1 = "12/06/2022";
        String day2 = "24/11/2011";
        LocalDate s1 = LocalDate.parse(day1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate s2 = LocalDate.parse(day2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Duration a = Duration.between(s2.atStartOfDay(), s1.atStartOfDay());
        System.out.println(a.toMillis());

    }
}
