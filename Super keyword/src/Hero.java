public class Hero extends Person{

    String power;

    Hero(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    public String toString() {
        return super.toString() + " and his power is " + "*" + this.power + "*";
    }
}
