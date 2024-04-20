import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class TestCases{

        @SuppressWarnings("deprecation")
		@Test
        public void testSaveAndReadTrainsToFile() {
            // Create trains
            Train train1 = new Train(101, "Goa to Mumbai", 500.0, 100, CoachType.AC, TypeOfService.TATKAL);
            Train train2 = new Train(102, "Mumbai to Goa", 550.0, 120, CoachType.SLEEPER, TypeOfService.REGULAR);
            Train[] trains = {train1, train2};

            // Save trains to file
            FileHandler.saveTrainsToFile("testTrainsFile.txt", trains);

            // Read trains from file
            Train[] savedTrains = FileHandler.readTrainsFromFile("testTrainsFile.txt");

            // Assert that saved trains are not null
            assertNotNull(savedTrains);
            // Assert that the length of saved trains is the same as the original array
            assertEquals(trains.length, savedTrains.length);
            // Assert that each train object in the saved array matches the original train object
            for (int i = 0; i < trains.length; i++) {
                assertEquals(trains[i].getTrainNumber(), savedTrains[i].getTrainNumber());
                assertEquals(trains[i].getRoute(), savedTrains[i].getRoute());
                assertEquals(trains[i].getFare(), savedTrains[i].getFare());
                assertEquals(trains[i].getTotalSeats(), savedTrains[i].getTotalSeats());
                assertEquals(trains[i].getCoachType(), savedTrains[i].getCoachType());
                assertEquals(trains[i].getTypeOfService(), savedTrains[i].getTypeOfService());
            }
        }
    

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