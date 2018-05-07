import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;
    private double nightlyRate;
    private RoomType roomType;


    public Bedroom(int roomNumber, double nightlyRate, RoomType roomType) {
        super(roomType.getCapacity());
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(int nightlyRate) {
        this.nightlyRate = nightlyRate;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
}

