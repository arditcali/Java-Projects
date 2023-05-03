

public class Main {
    public static void main(String[] args) {

        int sec = 0;
        int min = 0;
        int hrs = 0;

        while(true) {
            if(sec <= 60) {
                sec++;
                if(sec == 60) {
                    min++;
                    sec = 0;
                }
            }
            if(min == 60) {
                hrs++;
                min = 0;
            }
            if(hrs == 24) {
                hrs = 0;
            }

            System.out.println(hrs + ":" + min + ":" + sec);
        }

    }
}