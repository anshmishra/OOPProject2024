import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler{

    public static void saveTrainsToFile(String filename, List<Train> trains){
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filename))){
            oos.writeObject(trains);
            System.out.println("Data saved to "+filename);
        }
        catch(IOException e){
            System.err.println("Error saving data to file");
        }
    }
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
    public static void savePassengersToFile(String filename, List<Passenger>passengers){
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filename))){
            oos.writeObject(passengers);
            System.out.println("Data saved successfully to "+filename);
        }
        catch(IOException e){
            System.err.println(("Error saving data"));
        }
    }
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