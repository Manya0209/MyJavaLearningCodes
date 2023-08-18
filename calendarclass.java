import java.util.Calendar;

public class calendarclass {
   public static void main(String[] args) {
    Calendar c= Calendar.getInstance();
    System.out.println(c.getCalendarType());
    System.out.println(c.getTimeZone());
   } 
}
