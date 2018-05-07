import org.junit.Before;

public class BedroomTest {

    Bedroom single;
    Guest guest;

    @Before
    public void before(){
        single = new Bedroom(101, 25.00, RoomType.SINGLE);
        guest = new Guest();
    }
}
