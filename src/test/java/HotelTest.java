import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Guest guest;
     ArrayList<Guest>  guests1;
     ArrayList<Guest>  guests2;

    ArrayList<Bedroom> bedrooms;

    ArrayList<ConferenceRoom> conferenceRooms;

    @Before
    public void SetUp(){
        guest = new Guest("David Irene");
        guests1 = new ArrayList<>();
        bedroom1 = new Bedroom(RoomType.SINGLE, guests1, 1, 1);
        bedroom2 = new Bedroom(RoomType.DOUBLE, guests2, 2, 2);
        conferenceRoom1 = new ConferenceRoom(50, guests1 , "Mike Ritchie Room");
        conferenceRoom2 = new ConferenceRoom(150, guests2 , "Fish Bowl Room");
        bedrooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        conferenceRooms.add(conferenceRoom1);
        conferenceRooms.add(conferenceRoom2);
        hotel = new Hotel(bedrooms, conferenceRooms);

    }

    @Test
    public void hasBedrooms(){
        ArrayList<Bedroom> hotelBedrooms = hotel.getBedrooms();
        assertEquals(2, hotelBedrooms.size());
    }

    @Test
    public void hasConferenceRooms(){
        ArrayList<ConferenceRoom> hotelConfrooms = hotel.getConferenceRooms();
        assertEquals(2, hotelConfrooms.size());
    }

    @Test
    public void canCheckInGuestToBedroom(){
        hotel.addGuestToBedroom(0, guest);
        assertEquals(1, guests1.size());
    }

    @Test
    public void canCheckOutGuestFromBedroom(){
        hotel.addGuestToBedroom(0, guest);
        hotel.removeGuestToBedroom(0, guest);
        assertEquals(0, guests1.size());
    }

}
