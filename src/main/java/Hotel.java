
import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedroom;
    private ArrayList<Dining> dining;
    private ArrayList<Conference> conference;

    public Hotel(String name){
        this.name = name;
        this.bedroom = new ArrayList<>();
        this.dining = new ArrayList<>();
        this.conference = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int bedRoomCount(){
        return this.bedroom.size();
    }

    public int conferenceRoomCount(){
        return this.conference.size();
    }

    public int diningRoomCount(){
        return this.dining.size();
    }

    public void addBedroom(Bedroom room){
        this.bedroom.add(room);
    }

    public void addDiningroom(Dining room){
        this.dining.add(room);
    }

    public void addConferenceroom(Conference room){
        this.conference.add(room);
    }

    public void checkIntoDiningRoom(Guest guest){
        for (Dining diningRoom : dining){
            if (diningRoom.getGuestCount() < diningRoom.getCapacity()){
                diningRoom.checkIn(guest);
                break;
            }
        }
    }

    public void checkIntoBedroom(int roomNumber, Guest guest){
        for (Bedroom room : bedroom){
            if (room.getRoomNumber() == roomNumber){
                room.checkIn(guest);
            }
        }
    }

    public void checkInToCOnference(Guest guest){
        // Loop through conference rooms

        // if room has capacity
        //add guest
        //stop loop
    }


}