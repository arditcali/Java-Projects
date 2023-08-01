public class Main {

    public static void main(String[] args) {

        MyThread thread2 = new MyThread();

        thread2.start();
        System.out.println(thread2.isAlive());

        thread2.setName("2nd thread");
        System.out.println(thread2.getName());

        thread2.setPriority(1);
        System.out.println(thread2.getPriority());

        System.out.println(Thread.activeCount());
    }
}