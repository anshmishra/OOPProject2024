import org.junit.Test;
import static org.junit.Assert.*;

public class PassengerTest {

    @Test
    public void testPassengerInitialization() {
        Passenger passenger = new PassengerImpl("John Doe", 35, new MilitaryService());

        assertEquals("John Doe", passenger.getName());
        assertEquals(35, passenger.getAge());
        assertEquals(new MilitaryService(), passenger.getSpecialService());
    }

    @Test
    public void testSetName() {
        Passenger passenger = new PassengerImpl("John Doe", 35, null);
        passenger.setName("Jane Doe");

        assertEquals("Jane Doe", passenger.getName());
    }

    @Test
    public void testSetAge() {
        Passenger passenger = new PassengerImpl("John Doe", 35, null);
        passenger.setAge(40);

        assertEquals(40, passenger.getAge());
    }

    @Test
    public void testSetSpecialService() {
        SpecialService specialService = new StudentService();
        Passenger passenger = new PassengerImpl("John Doe", 35, null);
        passenger.setSpecialService(specialService);

        assertEquals(specialService, passenger.getSpecialService());
    }

    // Concrete implementation of Passenger for testing
    private class PassengerImpl extends Passenger {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public PassengerImpl(String name, int age, SpecialService specialService) {
            super(name, age, specialService);
        }
    }
}
