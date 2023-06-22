import java.util.ArrayList;

public class Bedroom extends Room {

    RoomType roomType;
    int  roomNumber;

    public Bedroom(RoomType roomType, ArrayList<Guest> guestCollection, int roomNumber, int capacity){
        super(guestCollection, capacity);
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType(){
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }


}
