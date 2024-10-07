package day9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingParse {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024,10,16,8,43,50);
        System.out.println(dt);

        String date  = dt.format(DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss a"));   // a is for AM/PM
        System.out.println(date);

        date = dt.format(DateTimeFormatter.ofPattern("E -MM-yy HH:mm:ss"));      // E is to print the day of the week
        System.out.println(date);

        String mydate = "24:10/12 04:23:43";       // always the year comes first
        LocalDateTime mydt = LocalDateTime.parse(mydate,
                DateTimeFormatter.ofPattern("yy:MM/dd HH:mm:ss"));
        System.out.println(mydt);
    }
}
