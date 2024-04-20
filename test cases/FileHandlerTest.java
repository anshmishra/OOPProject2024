import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileHandlerTest {

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
}
