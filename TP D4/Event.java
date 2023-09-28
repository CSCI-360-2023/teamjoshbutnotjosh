import java.util.Date;
import java.util.ArrayList;

public class Event {
    private int eventId;
    private String eventTitle;
    private Venue location;
    private Date date;
    private int time;
    private ArrayList<Ticket> tickets;

    public Event() {

    }
    public void displayEvent() {

    }
    public void holdTicket(Ticket ticket) {

    }
    public void updateTickets(Ticket ticket) {

    }
    //getters&setters
    public int getEventId() { return this.eventId; }
    public String getEventTitle() { return this.eventTitle; }
    public Venue getLocation() { return this.location; }
    public Date getDate() { return this.date; }
    public int getTime() { return this.time; }

    public void updateLocation(Venue input) {

    }
    public void updateDate(Date input) {

    }
    public void updateTime(int input) {

    }
}
