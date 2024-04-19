import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReservationSystem{
    private Ticket[] bookedTickets;
    private int capacity;
    private int numBookedTickets;

    public ReservationSystem(int capacity){
        this.capacity=capacity;
        this.bookedTickets=new Ticket[capacity];
        this.numBookedTickets=0;
    }

    public void bookTicket(Ticket ticket){
        if(numBookedTickets<capacity){
            bookedTickets[numBookedTickets]=ticket;
            numBookedTickets++;
            System.out.println("Ticket booked");
        }else System.out.println("Failed to book ticket. All tickets sold");
    }

    //VARARGS - using varargs to book multiple tickets at once (OVERLOADED METHOD)
    public void bookTickets(Ticket...tickets){
        for(Ticket ticket : tickets){
            bookTicket(ticket);
        }
    }
    public void bookTicketsWithService(Service service, Ticket... tickets){
        for(Ticket ticket:tickets){
            ticket.setService(service);
            bookTicket(ticket);
        }
    }
    //MULTITHREADING - using multithreading to book multiple tickets at the same time
    public void bookTicketsParallely(Ticket...tickets) {
    	ExecutorService executor = Executors.newFixedThreadPool(5);
    	for(Ticket ticket:tickets) {
    		executor.execute(new BookingTask(ticket));
    	}
    	executor.shutdown();
    }
    public class BookingTask implements Runnable{
    	private Ticket ticket;
    	public BookingTask(Ticket ticket) {
    		this.ticket=ticket;
    	}
		@Override
		public void run() {
			bookTicket(ticket);
			
		}
    }
    
    

    public void cancelTicket(Ticket ticket){
        for(int i=0;i<numBookedTickets;i++){
            if(bookedTickets[i].equals(ticket)){
                for(int j=i;j<numBookedTickets-1;j++){
                    bookedTickets[j]=bookedTickets[j+1];
                }
                bookedTickets[numBookedTickets-1]=null;
                numBookedTickets--;
                System.out.println("Ticket cancelled");
            }
        }
        System.out.println("Ticket not found");
    }

    public boolean checkAvail(Ticket ticket){
        for(int i=0;i<numBookedTickets;i++){
            if(bookedTickets[i].equals(ticket)){
                return true;
            }
        }
        return false;
    }

    public Ticket[] getBookedTickets(){
        return bookedTickets;
    }
}