public class Event {
    private int eventId;
    private String name;
    private Venue venue;
    private String dateTime;
    private float ticketPrice;
    private int totalTickets;
    private int availableTickets;

    // Getters
    public int getEventId() { return eventId; }
    public String getName() { return name; }
    public Venue getVenue() { return venue; }
    public String getDateTime() { return dateTime; }
    public float getTicketPrice() { return ticketPrice; }
    public int getTotalTickets() { return totalTickets; }
    public int getAvailableTickets() { return availableTickets; }

    // Setters
    public void setEventId(int eventId) { this.eventId = eventId; }
    public void setName(String name) { this.name = name; }
    public void setVenue(Venue venue) { this.venue = venue; }
    public void setDateTime(String dateTime) { this.dateTime = dateTime; }
    public void setTicketPrice(float ticketPrice) { this.ticketPrice = ticketPrice; }
    public void setTotalTickets(int totalTickets) { this.totalTickets = totalTickets; }
    public void setAvailableTickets(int availableTickets) { this.availableTickets = availableTickets; }

    // Methods
    public boolean createEvent() {
        // Implementation to create an event
        return true;
    }

    public boolean updateEvent() {
        // Implementation to update an event
        return true;
    }

    public boolean deleteEvent() {
        // Implementation to delete an event
        return true;
    }

    public boolean bookTicket() {
        if (availableTickets > 0) {
            availableTickets--;
            return true;
        }
        return false;
    }

    public void cancelTicket() {
        availableTickets++;
    }
}



//Below is Leo's Event class
// import java.util.Date;
// import java.util.ArrayList;

// public class Event {
//     private int eventId;
//     private String eventTitle;
//     private Venue location;
//     private Date date;
//     private int time;
//     private ArrayList<Ticket> tickets;

//     public Event() {

//     }
//     public void displayEvent() {

//     }
//     public void holdTicket(Ticket ticket) {

//     }
//     public void updateTickets(Ticket ticket) {

//     }
//     //getters&setters
//     public int getEventId() { return this.eventId; }
//     public String getEventTitle() { return this.eventTitle; }
//     public Venue getLocation() { return this.location; }
//     public Date getDate() { return this.date; }
//     public int getTime() { return this.time; }

//     public void updateLocation(Venue input) {

//     }
//     public void updateDate(Date input) {

//     }
//     public void updateTime(int input) {

//     }
// }
