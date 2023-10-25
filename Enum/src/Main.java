
public class Main {

    public static void main(String[] args) {

        Months month = Months.MARCH;

        switch (month) {
            case JANUARY :
                System.out.println("first month");
                System.out.println("This is month nr " + month.nr);
                break;
            case FEBRUARY :
                System.out.println("second month");
                System.out.println("This is month nr " + month.nr);
                break;
            case MARCH :
                System.out.println("third month");
                System.out.println("This is month nr " + month.nr);
                break;
            case APRIL :
                System.out.println("fourth month");
                System.out.println("This is month nr " + month.nr);
                break;
            default : System.out.println("wrong month");
        }

        for (Months x : Months.values()) {
            System.out.println(x);
        }
    }
}