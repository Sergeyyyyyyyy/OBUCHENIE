import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

class SomeClass111 {
    public static void main(String s[]) {
        Calendar cal = new GregorianCalendar ();
        cal.set(Calendar.YEAR, 2011);
        cal.set(Calendar.MONTH, Calendar.APRIL);
        cal.set(Calendar.DAY_OF_MONTH, 30);
        cal.add(Calendar.DAY_OF_MONTH, 1);
        cal.roll(Calendar.MONTH, 11);
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy MMMM dd");
        System.out.println(sdf.format  (cal.getTime()));
    }
}

