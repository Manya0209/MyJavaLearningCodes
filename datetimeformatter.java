import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy--E H:m a");

        String mydate= dt.format(df);
        System.out.println(mydate);
    }
}
