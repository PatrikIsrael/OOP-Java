import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formater02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.parse("20/07/2022", formater);
        LocalDateTime d02 = LocalDateTime.parse("11/07/2025 23:00", formater02);
        LocalDate d03  = LocalDate.of(2025, 07, 11);
        LocalDateTime d04 = LocalDateTime.of(2025,07,11,23,8);


        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
    }
}