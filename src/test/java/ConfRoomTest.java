import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConfRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;
    ArrayList<Guest> guestList;

    @Before
    public void SetUp(){
        guest1 = new Guest("Barbara Liskov");
        guest2 = new Guest("David Irene");
        guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);
        conferenceRoom = new ConferenceRoom(50, guests , "Mike Ritchie Room");
    }

    @Test
    public void hasName(){
        assertEquals("Mike Ritchie Room", conferenceRoom.getName());
    }


}
