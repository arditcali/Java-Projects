import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };

        Calendar date = Calendar.getInstance();

        date.set(Calendar.YEAR, 2023);
        date.set(Calendar.MONTH, Calendar.JULY);
        date.set(Calendar.DAY_OF_MONTH, 30);
        date.set(Calendar.HOUR_OF_DAY, 11);
        date.set(Calendar.MINUTE, 40);
        date.set(Calendar.SECOND, 30);
        date.set(Calendar.MILLISECOND, 0);

        timer.schedule(task, date.getTime());
    }
}