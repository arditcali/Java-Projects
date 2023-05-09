public class Employee extends Person {
    double annualSalary;
    double salary;
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.annualSalary = 0;
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return this.annualSalary = this.salary * 12;
    }

    public String toString() {
        return "Name: " + this.name + ", age: " + this.age + ", salary: " + this.salary;
    }
}
