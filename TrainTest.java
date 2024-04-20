//Testcase file to test Train.java, CoachType.java and TypeOfService.java
import org.junit.Test;
import static org.junit.Assert.*;

public class TrainTest {

    @Test
    public void testTrainInitialization() {
        Train train = new Train(110078, "Goa to Delhi", 500.0, 50, CoachType.AC, TypeOfService.REGULAR);

        assertEquals(110078, train.getTrainNumber());
        assertEquals("Goa to Delhi", train.getRoute());
        assertEquals(500.0, train.getFare(), 0.01);
        assertEquals(50, train.getTotalSeats());
        assertEquals(50, train.getAvailableSeats());
        assertEquals(CoachType.AC, train.getCoachType());
        assertEquals(TypeOfService.REGULAR, train.getTypeOfService());
    }

    @Test
    public void testBookSeat() {
        Train train = new Train(110078, "Goa to Delhi", 500.0, 50, CoachType.AC, TypeOfService.REGULAR);

        assertTrue(train.bookSeat());
        assertEquals(49, train.getAvailableSeats());
    }

    @Test
    public void testCancelSeat() {
        Train train = new Train(110078, "Goa to Delhi", 500.0, 50, CoachType.AC, TypeOfService.REGULAR);
        train.bookSeat(); 

        train.cancelSeat();
        assertEquals(50, train.getAvailableSeats());
    }
}
