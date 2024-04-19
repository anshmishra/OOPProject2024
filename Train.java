/**
 * Represents a Train with a number, route, fare, totalSeats, availableSeats, coachType and TypeOfService.
 * This class provides methods to get and set train details.
 * 
 */
import java.io.Serializable;
public class Train implements Serializable{
    private Integer trainNumber; //WRAPPER
    private String route;
    private double fare;
    private int totalSeats;
    private int availableSeats;
    private Seat[] seats;
    private CoachType coachType;
    private TypeOfService typeOfService;

    //Constructor
        /**
     * Constructs a Train object with the given parameters.
     *
     * @param trainNumber the train number (int)
     * @param route the route of the train (String)
     * @param fare the fare for the train (double)
     * @param totalSeats the total number of seats in the train (int)
     * @param coachType the type of coach in the train
     * @param typeOfService the type of service offered by the train (TATKAL,REGULAR)
     */
    public Train(int trainNumber, String route, double fare, int totalSeats, CoachType coachType, TypeOfService typeOfService){
        this.trainNumber=trainNumber;
        this.route=route;
        this.fare=fare;
        this.totalSeats=totalSeats;
        this.availableSeats=totalSeats;
        this.coachType=coachType;
        this.typeOfService=typeOfService;
    }

    //Getters and Setters
    public int getTrainNumber(){
        return trainNumber;
    }
    public void setTrainNumber(int trainNumber){
        this.trainNumber=trainNumber;
    }
    public String getRoute(){
        return route;
    }
    public void setRoute(String route){
        this.route=route;
    }
    public double getFare(){
        return fare;
    }
    public void setFare(double fare){
        this.fare=fare;
    }
    public int getTotalSeats(){
        return totalSeats;
    }
    public void setTotalSeats(int totalSeats){
        this.totalSeats=totalSeats;
    }
    public int getAvailableSeats(){
        return availableSeats;
    }
    public void setAvailableSeats(int availableSeats){
        this.availableSeats=availableSeats;
    }
    public CoachType getCoachType(){
        return coachType;
    }
    public void setCoachType(CoachType coachType){
        this.coachType=coachType;
    }
    public TypeOfService getTypeOfService(){
        return typeOfService;
    }
    public void setTypeOfService(TypeOfService typeOfService){
        this.typeOfService=typeOfService;
    }

    //Method to book seat
    public boolean bookSeat(){
        if(availableSeats>0){
            availableSeats--;
            return true;
        }
        else return false;
        
    }

    //Method to cancel booking
    public void cancelSeat(){
        if(availableSeats<totalSeats){
            availableSeats++;
        }
    }

    //OVERRIDE METHOD : toString() for easier printing
    public String toString(){
        return "Train{" +"trainNumber=" + trainNumber +", route='" + route + '\'' +", fare=" + fare +", totalSeats=" + totalSeats +", availableSeats=" + availableSeats +", coachType=" + coachType +", typeOfService=" + typeOfService +'}';
    }
    
    //NESTED CLASS
    public static class Seat{
    	private int seatNumber;
    	private boolean status;
    	
    	public Seat (int seatNumber) {
    		this.seatNumber=seatNumber;
    		this.status=false;
    	}
    	
    	public int getSeatNumber() {
    		return seatNumber;
    	}
    	public boolean isOccupied() {
    		return status;
    	}
    	public void occupy() {
    		status=true;
    	}
    	public void free() {
    		status=false;
    	}
    }
}
