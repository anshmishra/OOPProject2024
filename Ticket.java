/**
 * Represents a ticket for a train journey.
 */
import java.io.Serializable;

public class Ticket implements Serializable{
    private static final long serialVersionUID=1L;
    private int ticketNumber;
    private Train train;
    private Passenger passenger;
    private BookingStatus bookingStatus;
       /**
     * Constructs a new ticket with the given details.
     *
     * @param ticketNumber the ticket number
     * @param train the train associated with the ticket
     * @param passenger the passenger associated with the ticket
     * @param bookingStatus the booking status of the ticket
     */ 
    public Ticket(int ticketNumber, Train train, Passenger passenger, BookingStatus bookingStatus){
        this.ticketNumber=ticketNumber;
        this.train=train;
        this.passenger=passenger;
        this.bookingStatus=bookingStatus;
    }

    //Getters and setters
    public int getTicketNumber() {
        return ticketNumber;
    }
    public Train getTrain() {
        return train;
    }
    public void setTrain(Train train) {
        this.train = train;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }
    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    //override method : toString
    public String toString(){
        return "Ticket{" +"ticketNumber=" + ticketNumber +", train=" + train +", passenger=" + passenger +", bookingStatus=" + bookingStatus +'}';
    }
}
