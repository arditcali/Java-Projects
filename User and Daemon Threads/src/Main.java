public class Main {

    public static void main(String[] args) {

        MyThread thread2 = new MyThread();

        thread2.setDaemon(true);
        //thread2.setDaemon(false);

        System.out.println(thread2.isDaemon());
        
    }
}