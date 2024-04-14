public class Train{
    private int trainNumber;
    private String route;
    private double fare;
    private int totalSeats;
    private int availableSeats;
    private CoachType coachType;
    private TypeOfService typeOfService;

    //Constructor
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
        else{
            return false;
        }
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
}