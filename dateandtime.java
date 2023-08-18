import java.util.Date;

public class dateandtime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
//1000-seconds
//3600-minutes
//24-hours
//365-days

        Date d= new Date();
        System.out.println(d); 
        System.out.println(d.getTime());        
        System.out.println(d.getDate());        
        System.out.println(d.getYear());        
        System.out.println(d.getSeconds());
    }
}
