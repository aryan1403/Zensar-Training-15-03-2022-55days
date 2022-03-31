package meow;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.TimeZone;

public class dateapiex {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());

        String[] tzones = TimeZone.getAvailableIDs();

        for (String s : tzones) {
            // System.out.println(s);
        }
        
        // LocalDateTime ldt = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(LocalDateTime.now(ZoneId.of("Hongkong")));   
    }
}
