import java.time.LocalDate;
import java.time.LocalDateTime;

public class timepackage {
   public static void main(String[] args) {
    LocalDateTime dt= LocalDateTime.now();
    System.out.println(dt);

    LocalDate d= LocalDate.now();
    System.out.println(d);
   } 
}
