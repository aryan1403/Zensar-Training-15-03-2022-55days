package meow;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateformattingex {
    public static void main(String[] args) {
        // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yy");
        LocalDate ld = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MMMM/uuuu");
        System.out.println(ld.format(df));        
    }
}
