package presentationExcercises;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeExcercise {

    /*Wypisz aktualny czas lokalny.
Wypisz czas i datę w Tokio
Sformatuj bieżącą datę jako rok/miesiac/dzień.
*/
    public static void dateNow() {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("LocalDataTime: " + current);
    }

    public static void timeTokio() {
        Clock clock = Clock.system(ZoneId.of("Asia/Tokyo"));
        LocalDateTime current = LocalDateTime.now(clock);
        System.out.println("Japan time: " + current);
    }

    public static void dateFormat() {
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println("Date format: " + formatter.format(current));
    }

    public static void main(String[] args) {
        dateNow();
        timeTokio();
        dateFormat();
    }
}
