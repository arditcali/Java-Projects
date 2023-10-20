public class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "The name is " + this.name + " and is " + this.age + " years old";
    }
}
