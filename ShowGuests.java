import static java.lang.System.out;

public class ShowGuests {
    public static void main(String args[]) {
        int guests[] = new int[10];

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            guests[roomNum] = roomNum + 1;
        }

        out.println("Room\tGuests");

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            out.print(roomNum);
            out.print("\t");
            out.println(guests[roomNum]);
        }
    }
}
