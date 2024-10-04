package day8.Assignment1;

import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.stream.Stream;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate diwali = LocalDate.of(2025, 11, 1);
        System.out.println(diwali);

        Period timetoDiwali = today.until(diwali);
        System.out.println(timetoDiwali);
        System.out.println(timetoDiwali.getYears()+" year(s) "+ timetoDiwali.getMonths() +" month(s)" + timetoDiwali.getDays() + " day(s)");

        long daystoDiwali = today.until(diwali, ChronoUnit.DAYS);
        System.out.println(daystoDiwali + " day(s)");

        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getMonthValue());
        System.out.println(today.getMonth());
        System.out.println(today.getYear());

        LocalDate tomorrow = today.plusDays(1);
        System.out.println(tomorrow);
        LocalDate nextFriday = today.plus(7, ChronoUnit.DAYS);
        System.out.println(nextFriday);

        System.out.println("----------------------------------------------------------------");
        Stream<LocalDate> currentyear = LocalDate.of(2024, 1, 1).datesUntil(LocalDate.of(2025, 1, 1));

        currentyear.filter((date) -> date.getDayOfWeek().equals(DayOfWeek.FRIDAY)).filter(date -> date.getDayOfMonth() == 13).forEach((System.out::println));

        System.out.println(today.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek());

        System.out.println(today.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));

        System.out.println(today.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)));
    }
}
