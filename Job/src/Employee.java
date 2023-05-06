public class Employee {
    String name;
    int age;
    double salary;
    CompanyLocation state;

    Employee(String name, int age, double salary, CompanyLocation state) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.state = state;
    }

    void raiseSalary() {
        this.salary = this.salary + 2500;
    }

    void print() {
        System.out.println(name + " is " + age + " years old. His salary is " + salary);
    }
}
