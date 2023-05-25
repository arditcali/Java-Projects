public class Main {

    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.flee();
        fish.catches();
        System.out.println();

        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        System.out.println();

        Hawk hawk = new Hawk();
        hawk.catches();
    }
}
