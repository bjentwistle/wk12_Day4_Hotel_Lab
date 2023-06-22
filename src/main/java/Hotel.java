import java.util.ArrayList;

public class Hotel {

    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom>conferenceRooms;
    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom>conferenceRooms){
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void addGuestToBedroom(int index, Guest guest){
        bedrooms.get(index).addGuest(guest);
    }

    public void removeGuestToBedroom(int index, Guest guest){
        bedrooms.get(index).removeGuest(guest);
    }
}
