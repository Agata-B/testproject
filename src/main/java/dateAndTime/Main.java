package dateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        /*Data i czas
9. Wykorzystując obiekt typu LocalTime wyświetl aktualny czas.
10. Wykorzystując obiekt typu LocalDate wyświetl aktualną datę.
11. Wykorzystując obiekt typu LocalDateTime wyświetl aktualną datę i godzinę.
12. Utwórz obiekt typu LocalDate przechowujący datę 01.01.2017 oraz obiekt typu
LocalDate przechowujący datę 05.05.2017. Wykorzystując obiekt typu Period
Wyświetl ile czasu minęło pomiędzy datami.
13. Utwórz obiekt typu LocalTime przechowujący godzinę 14:11 oraz obiekt typu
LocalTime przechowujący godzinę 18:41. Wykorzystując klasę Duration oblicz ile
czasu upłynęło pomiędzy godzinami.
14. Wyświetl bieżącą datę i godzinę w Tokyo.
15. Wyświetla bieżącą godzinę w Bydgoszczy. Wykorzystaj DateTimeFormatter aby
wyświetlić datę w następującym formacie
3 lutego 2018 roku, sobota 22:12:27

         */

        System.out.println("Zad. 9 " + LocalTime.now());
        System.out.println("Zad. 10 " + LocalDate.now());
        System.out.println("Zad. 11 " + LocalDateTime.now());
        LocalDate date1 = LocalDate.of(2017, 01, 01);
        LocalDate date2 = LocalDate.of(2017, 05, 05);

        System.out.println("Zad. 12 " + Period.between(date1, date2));               // Duration for the time-based equivalent to this class.

        LocalTime localTime1 = LocalTime.of(14, 11);
        LocalTime localTime2 = LocalTime.of(14, 11);
        System.out.println("Zad. 13 " + Duration.between(localTime1, localTime2));

        System.out.println("Zad. 14 " + LocalDateTime.now(ZoneId.of("Asia/Tokyo")));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy 'roku,' EEEE hh:mm:ss");
        System.out.println("Zad. 15 " + LocalDateTime.now().format(dateTimeFormatter));

    }

}
