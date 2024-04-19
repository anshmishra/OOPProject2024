import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class FileHandlerTest {

    @Test
    public void testSaveAndReadTrainsFromFile() {
        String filename = "testTrainsFile.txt";
        List<Train> originalTrains = new ArrayList<>();
        originalTrains.add(new Train(1, "Goa to Mumbai", 100.0, 200, CoachType.SLEEPER, TypeOfService.REGULAR));
        originalTrains.add(new Train(2, "Mumbai to Goa", 150.0, 150, CoachType.AC, TypeOfService.REGULAR));

        // Save trains to file
        FileHandler.saveTrainsToFile(filename, originalTrains);

        // Read trains from file
        List<Train> readTrains = FileHandler.readTrainsFromFile(filename);

        // Verify data integrity
        assertEquals(originalTrains.size(), readTrains.size());
        for (int i = 0; i < originalTrains.size(); i++) {
            assertEquals(originalTrains.get(i).toString(), readTrains.get(i).toString());
        }
    }

    @Test
    public void testSaveAndReadPassengersFromFile() {
        String filename = "testPassengersFile.txt";
        List<Passenger> originalPassengers = new ArrayList<>();
        originalPassengers.add(new Passenger("John Doe", 30, new StudentService()));
        originalPassengers.add(new Passenger("Alice Smith", 65, new SeniorCitizenService()));

        // Save passengers to file
        FileHandler.savePassengersToFile(filename, originalPassengers);

        // Read passengers from file
        List<Passenger> readPassengers = FileHandler.readPassengersFromFile(filename);

        // Verify data integrity
        assertEquals(originalPassengers.size(), readPassengers.size());
        for (int i = 0; i < originalPassengers.size(); i++) {
            assertEquals(originalPassengers.get(i).toString(), readPassengers.get(i).toString());
        }
    }
}
