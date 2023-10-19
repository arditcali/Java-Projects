public class Friend {
    String name;
    static int friendNr;

    Friend(String name) {
        this.name = name;
        friendNr++;
    }

    static public int getFriendNr() {
        return friendNr;
    }
}
