package meow;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

public class dateapiex {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());

        String[] tzones = TimeZone.getAvailableIDs();

        for (String s : tzones) {
            // System.out.println(s);
        }
        System.out.println(Duration.ofSeconds(10));
        Duration.ofSeconds(1);
        // Period // Longer
        // Timer
        Timer t = new Timer();

        System.out.println(LocalDateTime.now(ZoneId.of("Hongkong"))); 
        t.schedule(new TimerTask() {
    
            @Override
            public void run() {
                System.out.println("Hello Aaryan");
                
            }
            
        }, 5000);
        
        System.out.println(t.toString());
        
        // LocalDateTime ldt = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

    }
}
