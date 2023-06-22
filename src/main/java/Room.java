import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guestCollection;
    private int capacity;

    public Room(ArrayList<Guest> guestCollection, int capacity){
        this.guestCollection = guestCollection;
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuestCollection() {
        return this.guestCollection;
    }
    public int getCapacity() {
        return this.capacity;
    }

    public void addGuest(Guest guest){
        guestCollection.add(guest);

    }

    public void removeGuest(Guest guest){
        guestCollection.remove(guest);
    }

}
