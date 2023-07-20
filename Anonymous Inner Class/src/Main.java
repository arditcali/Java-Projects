public class Main {

    public static void main(String[] args) {

        Greeting greet = new Greeting() {
            @Override
            public void print() {
                System.out.println("yo yo yo");
            }
        };
        greet.print();

        Greeting greet1 = new Greeting();

        greet1.print();
    }
}
