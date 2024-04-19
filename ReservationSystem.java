public class ReservationSystem {
    private Ticket[] tickets;
    private int numTickets;    

    public ReservationSystem(int capacity){
        this.tickets=new Ticket[capacity];
        this.numTickets=0;
    }
    public void bookTicket(Ticket ticket){
        if(numTickets<tickets.length){
            tickets[numTickets++]=ticket;
            System.out.println("Booked successfully");
        } else System.out.println("Booking failed");
    }
    public void cancelTicket(Ticket ticket){
        for(int i=0;i<numTickets;i++){
            if(tickets[i].equals(ticket)){
                tickets[i]=tickets[numTickets-1];
                tickets[numTickets-1]=null;
                numTickets--;
                System.out.println("Booking cancelled");
            }
        }
    }
    public boolean checkAvail(Ticket ticket){
        for(int i=0;i<numTickets;i++){
            if(tickets[i].equals(ticket)){
                return true;
            }
        }
        return false;
    }
}


