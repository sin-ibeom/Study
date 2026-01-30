package Quiz_14;

public class Main {
    public static void main(String[] args) {
        Manage manage = new Manage();

        Room room = new Room(
                3,
                true,
                false
        );
        Room room2 = new Room(
                2,
                false,
                false
        );

        manage.addRoom(room, 2, 5);
        manage.addRoom(room2, 1, 3);
    }
}
