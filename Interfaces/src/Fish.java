public class Fish implements Prey, Predator{
    @Override
    public void flee() {
        System.out.println("Swim faster");
    }
    @Override
    public void catches() {
        System.out.println("Catch another fish");
    }
}
