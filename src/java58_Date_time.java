import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class java58_Date_time {
    public static void main(String[] args) {
        // CurrentTimeMillis(): Lấy thời gian hiện tại
        long t1 = System.currentTimeMillis();
        for (double i=0;i<00;i++){
            System.out.println("Test");
        }
        long t2 = System.currentTimeMillis();

        System.out.println("Mã t1 " + t1 );
        System.out.println("Mã t2 " + t2 );
        System.out.println("Thời gian thực hiện vòng lặp: " + (t2-t1) + "mls" );
        System.out.println("Thời gian thực hiện vòng lặp: " + (t2-t1)/1000 + "s" );

        //TimeUnit là một Enum nó giúp chuyển đổi thời gian
        int s = 10;
        long ms = TimeUnit.SECONDS.toMinutes(s);
        System.out.println(ms);//ms = 1000

        // Date
        Date d = new Date(System.currentTimeMillis());
        System.out.println(d.getDate() + "/" + (d.getMonth() + 1 ) + "/" + (d.getYear() + 1900 ) );

        //Calendar là một lớp trừu tượng
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.YEAR));

        // Date format
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(df.format(d));
    }
}
