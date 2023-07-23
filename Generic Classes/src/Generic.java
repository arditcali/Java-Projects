public class Generic <T extends Number, V extends Number> {
    T x;
    T y;
    Generic(T x, T y) {
        this.x = x;
        this.y = y;
    }
    public T getX() {
        return  this.x;
    }
    public T getY() {
        return  this.y;
    }
}
