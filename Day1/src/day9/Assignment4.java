package day9;

import java.time.*;
import java.util.stream.Stream;

public class Assignment4 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate dob = LocalDate.of(2001, 04, 16);

        System.out.println("Calculating current age in no. of days, months, years");
        Period age = dob.until(today);
        System.out.println(age);
        System.out.println("Age : "+age.getYears()+" Years, "+age.getMonths()+" Months, "+age.getDays()+" Days");

        System.out.println("======================================================================");
        System.out.println("Programmers Day on a particular Year ");
        LocalDate startYear = LocalDate.of(2024,1,1);
        LocalDate programmersDay = LocalDate.ofYearDay(startYear.getYear(),256);
        System.out.println("Programmers Day in "+startYear.getYear()+" year is on : "+programmersDay);

        System.out.println("======================================================================");
        System.out.println("Month in 2024 which started on Sunday");
        Stream<LocalDate> currentyear = LocalDate.of(2024, 1, 1).datesUntil(LocalDate.of(2025, 1, 1));
        currentyear.filter((date) -> date.getDayOfWeek().equals(DayOfWeek.SUNDAY)).filter((date) -> date.getDayOfMonth()==1).forEach((date)-> System.out.println(date.getMonth()));
        currentyear = LocalDate.of(2024, 1, 1).datesUntil(LocalDate.of(2025, 1, 1));
        currentyear.filter((date) -> date.getDayOfWeek().equals(DayOfWeek.SUNDAY)).filter((date) -> date.getDayOfMonth()==1).forEach(System.out::println);

        System.out.println("======================================================================");
        System.out.println("Leaving Mumbai at 02:05am and arrives NewYork at 04:40am ");
        ZoneId departureZone = ZoneId.of("Asia/Kolkata");
        ZoneId arrivalZone = ZoneId.of("America/New_York");

        ZonedDateTime departTime = ZonedDateTime.of(2024,10,07,02,05,0,0,departureZone);
        ZonedDateTime arrivalTime = ZonedDateTime.of(2024,10,07,04,40,0,0,arrivalZone);

        Duration flightDuration = Duration.between(departTime,arrivalTime);
        System.out.println(flightDuration);
        System.out.println("Flight Duration is : "+flightDuration.toHours()+" Hours, "+flightDuration.toMinutes()%60+" minutes");


    }
}
