package seminar1.task;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Scanner;

public class Task2 {
    public static void helloForMain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String userName = scanner.next();
        LocalDateTime now = LocalDateTime.now();
        if (now.isAfter(ChronoLocalDateTime.from(LocalTime.of(5,0))) &&
                now.isBefore(ChronoLocalDateTime.from(LocalTime.of(11,59)))) {
            System.out.println("Good morning, " + userName);
        } else if(now.isAfter(ChronoLocalDateTime.from(LocalTime.of(12,0))) &&
                now.isBefore(ChronoLocalDateTime.from(LocalTime.of(17,59)))) {
            System.out.println("Good day, " + userName);
        } else if (now.isAfter(ChronoLocalDateTime.from(LocalTime.of(18,0))) &&
                now.isBefore(ChronoLocalDateTime.from(LocalTime.of(20,59)))) {
            System.out.println("Good evening, " + userName);
        } else {
            System.out.println("Good night, " + userName);
        }
    }
}
