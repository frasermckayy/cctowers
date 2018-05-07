import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;


    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public void checkIn(Guest guest){
        this.guests.add(guest);
    }

    public int getCapacity() {
        return capacity;
    }

    public int getGuestCount(){
        return this.guests.size();
    }
}
