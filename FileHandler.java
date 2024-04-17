/**
 * Provides methods for saving and reading lists of Train and Passenger objects to and from files.
*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler{
	
	/**
     * Saves a list of Train objects to a file using serialization.
     *
     * @param filename the name of the file to save the trains to
     * @param trains the list of trains to save
     */
    public static void saveTrainsToFile(String filename, List<Train> trains){
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filename))){
            oos.writeObject(trains);
            System.out.println("Data saved to "+filename);
        }
        catch(IOException e){
            System.err.println("Error saving data to file");
        }
    }
    
    /**
     * Reads a list of Train objects from a file using serialization.
     *
     * @param filename the name of the file to read the trains from
     * @return a list of trains read from the file
     */
    public static List<Train> readTrainsFromFile(String filename){
        List<Train> trains = new ArrayList<>();
        try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filename))){
            trains=(List<Train>) ois.readObject();
            System.out.println("Data read successfully from "+filename);
        }
        catch (IOException | ClassNotFoundException e){
            System.err.println("Error reading train data");
        }
        return trains;
    }
    
    /**
     * Saves a list of Passenger objects to a file using serialization.
     *
     * @param filename the name of the file to save the passengers to
     * @param passengers the list of passengers to save
     */
    public static void savePassengersToFile(String filename, List<Passenger>passengers){
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filename))){
            oos.writeObject(passengers);
            System.out.println("Data saved successfully to "+filename);
        }
        catch(IOException e){
            System.err.println(("Error saving data"));
        }
    }
    
    /**
     * Reads a list of Passenger objects from a file using serialization.
     *
     * @param filename the name of the file to read the passengers from
     * @return a list of passengers read from the file
     */
    public static List<Passenger> readPassengersFromFile(String filename){
        List<Passenger> passengers = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
            passengers=(List<Passenger>) ois.readObject();
            System.out.println("Data read successfully");
        }
        catch(IOException | ClassNotFoundException e){
            System.err.println("Error reading data");
        }
        return passengers;
    }
}