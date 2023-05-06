
public class Main {

    public static void main(String[] args) {

        Employee Jon = new Employee("Jon", 42, 2500, CompanyLocation.Ontario);
        Employee Ben = new Employee("Ben", 50, 3000, CompanyLocation.California);

        Jon.raiseSalary();
        Jon.raiseSalary();
        Ben.raiseSalary();

        Ben.print();
        Jon.print();

    }
}