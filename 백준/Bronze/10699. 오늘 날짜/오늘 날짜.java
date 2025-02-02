import java.time.*;
import java.time.format.*;

public class Main {
    public static void main(String[] args) {
        ZoneId seoul = ZoneId.of("Asia/Seoul");
        LocalDate seoulgogo = LocalDate.now(seoul);
        DateTimeFormatter koreachaego = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(seoulgogo.format(koreachaego));
    }
}
