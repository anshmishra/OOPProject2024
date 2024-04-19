import org.junit.Test;
import static org.junit.Assert.*;

public class ReservationSystemTest {
    @Test
    public void testBookTicket() {
        ReservationSystem reservationSystem = new ReservationSystem(3);

        Train train1 = new Train(403726, "Goa to Delhi", 200.0, 50, CoachType.AC, TypeOfService.REGULAR);
        Train train2 = new Train(110078, "Delhi to Goa", 250.0, 100, CoachType.GENERAL, TypeOfService.TATKAL);
        Train train3 = new Train(123456, "Goa to Mumbai", 100.0, 50, CoachType.SLEEPER, TypeOfService.REGULAR);

        Passenger passenger1 = new Passenger("Ansh Mishra",20, new MilitaryService());
        Passenger passenger2 = new Passenger("Sonakshi Singh", 20, new StudentService());
        Passenger passenger3 = new Passenger("Devansh Agarwal", 70, new SeniorCitizenService());

        Ticket ticket1 = new Ticket(1, train1, passenger1, BookingStatus.CONFIRMED);
        Ticket ticket2 = new Ticket(2, train2, passenger2, BookingStatus.RAC);
        Ticket ticket3 = new Ticket(3, train3, passenger3, BookingStatus.WAITING);
        
        reservationSystem.bookTicket(ticket1);
        reservationSystem.bookTicket(ticket2);
        reservationSystem.bookTicket(ticket3);

        assertTrue(reservationSystem.checkAvail(ticket1));
        assertTrue(reservationSystem.checkAvail(ticket2));
        assertTrue(reservationSystem.checkAvail(ticket3));
    }
    @Test
    public void testCancelTicket() {
    	
        ReservationSystem reservationSystem = new ReservationSystem(2);

        Train train1 = new Train(403726, "Goa to Delhi", 200.0, 50, CoachType.AC, TypeOfService.REGULAR);
        Train train2 = new Train(110078, "Delhi to Goa", 250.0, 100, CoachType.GENERAL, TypeOfService.TATKAL);

        Passenger passenger1 = new Passenger("Ansh Mishra",20, new MilitaryService());
        Passenger passenger2 = new Passenger("Sonakshi Singh", 20, new StudentService());

        Ticket ticket1 = new Ticket(1, train1, passenger1, BookingStatus.CONFIRMED);
        Ticket ticket2 = new Ticket(2, train2, passenger2, BookingStatus.RAC);

        reservationSystem.bookTicket(ticket1);
        reservationSystem.bookTicket(ticket2);
        reservationSystem.cancelTicket(ticket1);

        assertFalse(reservationSystem.checkAvail(ticket1)); 
        assertTrue(reservationSystem.checkAvail(ticket2)); 
    }
}
