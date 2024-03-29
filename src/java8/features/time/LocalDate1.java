package java8.features.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName LocalDate1.java
 * @Description TODO
 * @createTime 2021年08月29日 10:22:00
 */
public class LocalDate1 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        LocalDate yesterday = tomorrow.minusDays(2);

        System.out.println(today);
        System.out.println(tomorrow);
        System.out.println(yesterday);

        LocalDate independenceDay = LocalDate.of(2014, Month.JULY,4);
        DayOfWeek dayOfWeek = independenceDay.getDayOfWeek();
        System.out.println(dayOfWeek);

        DateTimeFormatter germanFormatter =DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
                .withLocale(Locale.GERMAN);

        LocalDate xmas = LocalDate.parse("24.12.2014",germanFormatter);
        System.out.println(xmas);
    }
}
