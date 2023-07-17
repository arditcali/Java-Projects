

public class Main {

    public static void main(String[] args) {

        MyInterface my = (a, b) -> "hello " + a + b;
        example(my);
    }
    static void example(MyInterface x) {
        System.out.println(x.print("aaaaa", "bbbbb"));
    }
}
