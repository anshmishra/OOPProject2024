/**
 * Represents a Train with a number, route, fare, totalSeats, availableSeats, coachType and TypeOfService.
 * This class provides methods to get and set train details.
 */
public class Train{
    private int trainNumber;
    private String route;
    private double fare;
    private int totalSeats;
    private int availableSeats;
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
    /**
     * Gets the train number.
     *
     * @return trainNumber (int)
     */
    public int getTrainNumber(){
        return trainNumber;
    }
    /**
     * Sets the train number.
     *
     * @param trainNumber (int)
     */
    public void setTrainNumber(int trainNumber){
        this.trainNumber=trainNumber;
    }
    
    /**
     * Gets the Route for the train.
     *
     * @return the Route (String) for the train
     */ 
    public String getRoute(){
        return route;
    }
    /**
     * Sets the Route for the train.
     *
     * @param the route (String) for the train
     */
    public void setRoute(String route){
        this.route=route;
    }
    
    /**
     * Gets the fare for the train.
     *
     * @return (double)the fare for the train
     */
    public double getFare(){
        return fare;
    }
    /**
     * Sets the fare for the train.
     *
     * @param (double)the fare for the train
     */
    public void setFare(double fare){
        this.fare=fare;
    }
    
    /**
     * Gets the total number of seats in the train.
     *
     * @return (int)the total number of seats in the train
     */
    public int getTotalSeats(){
        return totalSeats;
    }
    /**
     * Sets the total number of seats in the train.
     *
     * @param (int)the total number of seats in the train
     */
    public void setTotalSeats(int totalSeats){
        this.totalSeats=totalSeats;
    }
    
    /**
     * Gets the number of available seats in the train.
     *
     * @return availableSeats the number of available seats in the train
     */
    public int getAvailableSeats(){
        return availableSeats;
    }
    /**
     * Sets the number of available seats in the train.
     *
     * @param (int)availableSeats the number of available seats in the train
     */
    public void setAvailableSeats(int availableSeats){
        this.availableSeats=availableSeats;
    }
    
    /**
     * Gets the type of coach in the train.
     *
     * @return coachType object
     */
    public CoachType getCoachType(){
        return coachType;
    }
    /**
     * Sets the type of coach in the train.
     *
     * @param coachType the type of coach in the train
     */
    public void setCoachType(CoachType coachType){
        this.coachType=coachType;
    }
    /**
     * Gets the type of service offered by the train.
     *
     * @return the typeofService object
     */
    public TypeOfService getTypeOfService(){
        return typeOfService;
    }
    /**
     * Sets the type of service offered by the train.
     *
     * @param typeOfService object
     */
    public void setTypeOfService(TypeOfService typeOfService){
        this.typeOfService=typeOfService;
    }

    //Method to book seat
    /**
     * Books a seat if one is available.
     *
     * @return true if a seat was successfully booked, false otherwise.
     */
    public boolean bookSeat(){
        if(availableSeats>0){
            availableSeats--;
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * Cancels a booking for a seat.
     */
    //Method to cancel booking
    public void cancelSeat(){
        if(availableSeats<totalSeats){
            availableSeats++;
        }
    }
    /**
     * Returns a string representation of the Train object for easier printing
     *
     * @return a string representation of the Train object for easier printing
     */
    //OVERRIDE METHOD : toString() for easier printing
    public String toString(){
        return "Train{" +"trainNumber=" + trainNumber +", route='" + route + '\'' +", fare=" + fare +", totalSeats=" + totalSeats +", availableSeats=" + availableSeats +", coachType=" + coachType +", typeOfService=" + typeOfService +'}';
    }
}