package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date1 = LocalDate.now();
        LocalTime date2 = LocalTime.now();
        Instant date3 = Instant.now();
        LocalDate date4 = LocalDate.parse("2026-01-08");

        Instant date5 = Instant.parse("2022-07-20T01:30:26-03:00");
        LocalDate date6 = LocalDate.parse("20/07/2022", fmt1);
        LocalDate date7 = LocalDate.of(2002, 8, 29);

        System.out.println("LocalDate = " + date1);
        System.out.println("LocalDateTime = " + date2);
        System.out.println("Instant = " + date3);
        System.out.println("Parse = " + date4);
        System.out.println(date5);
        System.out.println("DateTimeFormatter = " + date6);
        System.out.println("LocalDate.of = " + date7);
    }
}
