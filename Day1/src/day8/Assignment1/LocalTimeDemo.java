package day8.Assignment1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime noon = LocalTime.NOON;

        long diff = now.until(noon, ChronoUnit.MINUTES);
        System.out.println(diff);

        Duration interval = Duration.between(now, noon);
        System.out.println(interval);

        now = now.plusHours(1);
        now = now.plus(10, ChronoUnit.MINUTES);
        System.out.println(now);

        LocalDateTime dt = now.atDate(LocalDate.of(2024, 10, 10));
        System.out.println(dt);
    }
}
