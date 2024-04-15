//Testcase file to test Passenger.java(testPassengerInitialization), StudentService.java(testStudentServiceDiscount), MilitaryService(testMilitaryServiceDiscount) and DisabledService.java(testDisabledServiceDiscount)
import org.junit.Test;
import static org.junit.Assert.*;

public class PassengerTest {

    @Test
    public void testPassengerInitialization() {
        Passenger passenger = new Passenger("Ansh Mishra", 20, new StudentService());

        assertEquals("Ansh Mishra", passenger.getName());
        assertEquals(20, passenger.getAge());
        assertTrue(passenger.getSpecialService() instanceof StudentService);
    }
    @Test
    public void testStudentServiceDiscount() {
        StudentService studentService = new StudentService();

        double fare = 100.0;
        double discountedFare = studentService.calculateDiscount(fare);
        assertEquals(70.0, discountedFare, 0.01);
    }
    @Test
    public void testMilitaryServiceDiscount() {
        MilitaryService militaryService = new MilitaryService();

        double fare = 100.0;
        double discountedFare = militaryService.calculateDiscount(fare);
        assertEquals(50.0, discountedFare, 0.01); 
    }

    @Test
    public void testDisabledServiceDiscount() {
        DisabledService disabledService = new DisabledService();

        double fare = 100.0;
        double discountedFare = disabledService.calculateDiscount(fare);
        assertEquals(45.0, discountedFare, 0.01); 
    }
}
