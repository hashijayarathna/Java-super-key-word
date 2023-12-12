public class House {
    House() {
        System.out.println("Family in the house");
    }
}
class Room extends House {
    Room() {
        super();
        System.out.println("Son in the room");
    }

    public static void main(String[] args) {
        Room r = new Room();
    }
}
