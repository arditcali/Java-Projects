
public class Main {
    public static void main(String[] args) {

        Employee jon = new Employee("Jon", 45, 4500);
        Owner ron = new Owner("Ron", 50, 75000);

        System.out.println(jon);
        ron.print();
    }
}