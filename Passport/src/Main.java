public class Main {

    public static void main(String[] args){
        Passport ron = new Passport(
                123546845,
                2030,
                "Ron",
                "Jackson",
                30,
                "American");

    }
    static class Passport{
        int number;
        int expiryDate;
        String name;
        String surname;
        int age;
        String nationality;

        Passport(int number, int expiryDate, String name, String surname, int age, String nationality){
            this.number = number;
            this.expiryDate = expiryDate;
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.nationality = nationality;
        }
    }
}