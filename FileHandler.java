/**
 * Provides methods for saving and reading lists of Train and Passenger objects to and from files.
 * 
 */
import java.io.*;

public class FileHandler{
    /**
     * Saves a list of Train objects to a file using serialization. Prints error on wrong input.
     *
     * @param filename the name of the file to save the trains to
     * @param trains the list of trains to save
     */
    public static void saveTrainsToFile(String filename, Train[] trains){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
            oos.writeInt(trains.length);
            for(Train train:trains){
                oos.writeObject(train);
            }
            System.out.println("Saved train data successfully");
        }catch(IOException e){
            System.err.println("Error saving train data");
        }
    }
        /**
     * Reads a list of Train objects from a file using serialization.
     *
     * @param filename the name of the file to read the trains from
     * @return a list of trains read from the file
     */
    public static Train[] readTrainsFromFile(String filename){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
            int numTrains=ois.readInt();
            Train[] trains = new Train[numTrains];
            for(int i=0;i<numTrains;i++){
                trains[i]=(Train)ois.readObject();
            }
            System.out.println("Read train data successfully");
            return trains;
        }catch (IOException | ClassNotFoundException e){
            System.err.println("Error reading train data");
            return null;
        }
    }

        /**
     * Saves a list of Passenger objects to a file using serialization.
     *
     * @param filename the name of the file to save the passengers to
     * @param passengers the list of passengers to save
     */
    public static void savePassengersToFile(String filename, Passenger[] passengers){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
            oos.writeInt(passengers.length);
            for(Passenger passenger:passengers){
                oos.writeObject(passenger);
            }
            System.out.println("Saved passenger data to file successfully");
        } catch(IOException e){
            System.err.println("Error reading passenger data");
        }
    }
        /**
     * Reads a list of Passenger objects from a file using serialization.
     *
     * @param filename the name of the file to read the passengers from
     * @return a list of passengers read from the file
     */
    public static Passenger[] readPassengersFromFile(String filename){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
            int numPassengers = ois.readInt();
            Passenger[] passengers = new Passenger[numPassengers];
            for(int i=0;i<numPassengers;i++){
                passengers[i]=(Passenger)ois.readObject();
            }
            System.out.println("Read passenger data successfully");
            return passengers;
        }catch(IOException | ClassNotFoundException e){
            System.err.println("Error reading passenger data");
            return null;
        }
    }
}
