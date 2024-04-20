import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReservationSystemTest {

    @Test
    public void testBookTicket() {
        ReservationSystem reservationSystem = new ReservationSystem(2);

        Ticket ticket1 = new Ticket(1, new Train(403726, "Delhi to Goa", 500.0, 100, CoachType.AC, TypeOfService.TATKAL),
                                    new Passenger("John", 30, new StudentService()), BookingStatus.CONFIRMED);
        Ticket ticket2 = new Ticket(2, new Train(110078, "Goa to Delhi", 550.0, 120, CoachType.SLEEPER, TypeOfService.REGULAR),
                                    new Passenger("Alice", 25, new SeniorCitizenService()), BookingStatus.CONFIRMED);
        
        reservationSystem.bookTicket(ticket1);
        reservationSystem.bookTicket(ticket2);

        assertEquals(2, reservationSystem.getBookedTickets().length);
    }

    @Test
    public void testCancelTicket() {
        ReservationSystem reservationSystem = new ReservationSystem(2);

        Ticket ticket1 = new Ticket(1, new Train(403726, "Delhi to Goa", 500.0, 100, CoachType.AC, TypeOfService.TATKAL),
                                    new Passenger("Ansh", 20, new MilitaryService()), BookingStatus.CONFIRMED);
        Ticket ticket2 = new Ticket(2, new Train(110078, "Goa to Delhi", 550.0, 120, CoachType.GENERAL, TypeOfService.REGULAR),
                                    new Passenger("Sonakshi", 20, new StudentService()), BookingStatus.RAC);
        
        reservationSystem.bookTicket(ticket1);
        reservationSystem.bookTicket(ticket2);

        reservationSystem.cancelTicket(ticket1);

        assertEquals(2, reservationSystem.getBookedTickets().length);
    }

    @Test
    public void testCheckAvailability() {
        ReservationSystem reservationSystem = new ReservationSystem(2);

        Ticket ticket1 = new Ticket(403726, new Train(101, "Delhi to Goa", 500.0, 100, CoachType.AC, TypeOfService.TATKAL),
                                    new Passenger("John", 30, new StudentService()), BookingStatus.CONFIRMED);
        
        reservationSystem.bookTicket(ticket1);
        assertTrue(reservationSystem.checkAvail(ticket1));
    }
}
