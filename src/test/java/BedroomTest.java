import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;
    ArrayList<Guest> guestList;

    @Before
    public void setUp(){
        guest1 = new Guest("Barbara Liskov");
        guest2 = new Guest("David Irene");
        guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);
        bedroom = new Bedroom(RoomType.DOUBLE, guests, 1, 2);
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void hasGuests(){
        guestList = bedroom.getGuestCollection();
        assertEquals(2, guestList.size());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }
}
