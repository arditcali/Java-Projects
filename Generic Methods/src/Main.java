
public class Main {

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B","Y","E"};

        array(intArray);
        array(doubleArray);
        array(charArray);
        array(stringArray);

        System.out.println();

        System.out.println(ret(intArray));
        System.out.println(ret(doubleArray));
        System.out.println(ret(charArray));
        System.out.println(ret(stringArray));
    }
    static <T> void array(T[] nr) {
        for (T x : nr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static <T> T ret(T[] array) {
        return array[0];
    }
}
