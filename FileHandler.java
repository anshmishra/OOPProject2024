import java.io.*;
import java.util.List;

public class FileHandler {

    // Save trains to file
    public static void saveTrainsToFile(String filename, List<Train> trains) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(trains);
            System.out.println("Trains data saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving trains data to file: " + e.getMessage());
        }
    }

    // Read trains from file
    @SuppressWarnings("unchecked")
    public static List<Train> readTrainsFromFile(String filename) {
        List<Train> trains = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            trains = (List<Train>) ois.readObject();
            System.out.println("Trains data read successfully from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading trains data from file: " + e.getMessage());
        }
        return trains;
    }

    // Save passengers to file
    public static void savePassengersToFile(String filename, List<Passenger> passengers) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(passengers);
            System.out.println("Passengers data saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving passengers data to file: " + e.getMessage());
        }
    }

    // Read passengers from file
    @SuppressWarnings("unchecked")
    public static List<Passenger> readPassengersFromFile(String filename) {
        List<Passenger> passengers = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            passengers = (List<Passenger>) ois.readObject();
            System.out.println("Passengers data read successfully from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading passengers data from file: " + e.getMessage());
        }
        return passengers;
    }
}
