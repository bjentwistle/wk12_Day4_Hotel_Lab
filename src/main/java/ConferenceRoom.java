import java.util.ArrayList;

public class ConferenceRoom extends Room{
    String name;

    public ConferenceRoom(int capacity, ArrayList<Guest>  guestCollection, String name){
        super(guestCollection, capacity);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
