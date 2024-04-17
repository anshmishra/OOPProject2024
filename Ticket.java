/**
 * Represents a ticket for a train journey.
 */


import java.io.Serializable;

public class Ticket implements Serializable{
	/**
     * A unique serial version for the ticket.
     */
    private static final long serialVersionUID=1L;
	/**
     * A ticket Number for the ticket.
     */    
    private int ticketNumber;
	/**
     * Train associated with ticket
     */
    private Train train;
	/**
     * Passenger associated with ticket
     */
    private Passenger passenger;
	/**
     * Booking Status associated with the ticket.
     */
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
    /**
     * Returns the ticket number.
     *
     * @return the ticket number
     */
    public int getTicketNumber() {
        return ticketNumber;
    }
    /**
     * Sets the ticket number.
     *
     * @param ticketNumber the ticket number
     */
    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    
    /**
     * Returns the train associated with the ticket.
     *
     * @return the train
     */
    public Train getTrain() {
        return train;
    }
    /**
     * Sets the train associated with the ticket.
     *
     * @param train the train
     */
    public void setTrain(Train train) {
        this.train = train;
    }
    
    /**
     * Returns the passenger associated with the ticket.
     *
     * @return the passenger
     */
    public Passenger getPassenger() {
        return passenger;
    }
    /**
     * Sets the passenger associated with the ticket.
     *
     * @param passenger the passenger
     */
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    
    /**
     * Returns the booking status of the ticket.
     *
     * @return the booking status
     */
    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }
    /**
     * Sets the booking status of the ticket.
     *
     * @param bookingStatus the booking status
     */
    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    /**
     * Returns a string representation of the ticket.
     *
     * @return a string representation of the ticket
     */
    //override method : toString
    public String toString(){
        return "Ticket{" +"ticketNumber=" + ticketNumber +", train=" + train +", passenger=" + passenger +", bookingStatus=" + bookingStatus +'}';
    }
}