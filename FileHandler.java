import java.io.*;

public class FileHandler{
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