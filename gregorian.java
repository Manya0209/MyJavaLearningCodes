import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class gregorian {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        System.out.println(c.get(Calendar.SECOND));        
        System.out.println(c.get(Calendar.HOUR));        
        System.out.println(c.get(Calendar.MINUTE));        
        System.out.println(c.get(Calendar.HOUR_OF_DAY));

        GregorianCalendar cal= new GregorianCalendar();
        System.out.println(cal.isLeapYear(2023));
        System.out.println(TimeZone.getAvailableIDs()[4]);
    }
}
