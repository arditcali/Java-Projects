public class Owner extends Person{
    double profits;

    public Owner(String name, int age, double profits) {
        super(name, age);
        this.profits = profits;
    }

    public void print() {
        System.out.println("name: " + this.name + ", age: " + this.age + ", profits: " + this.profits);
    }
}
