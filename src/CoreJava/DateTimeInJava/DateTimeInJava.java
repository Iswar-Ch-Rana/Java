package CoreJava.DateTimeInJava;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeInJava {
    static void main() {
        Date date2 = new Date();
        System.out.println("date -> " + date2);

        Instant instant = Instant.now();
        System.out.println("instant -> " + instant);

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate -> " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime -> " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime -> " + localDateTime);



        // Create a LocalDate object representing the current date
        LocalDate date1 = LocalDate.now();

        // Define the pattern for formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Format the LocalDate to a string
        String formattedDate = localDateTime.format(formatter);

        // Print the formatted date
        System.out.println("Formatted date: " + formattedDate);

        ZoneId defaultZone = ZoneId.systemDefault();
        System.out.println(defaultZone);
    }
}
