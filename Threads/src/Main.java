
public class Main {

    public static void main(String[] args) {

        System.out.println(Thread.activeCount());

        Thread.currentThread().setName("MAIN");
        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());

        System.out.println(Thread.currentThread().isAlive());


    }
}