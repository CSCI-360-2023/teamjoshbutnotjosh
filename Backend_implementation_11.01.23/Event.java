import java.util.Date;
import java.util.ArrayList;

public class Event {
    private int eventID;
    private String eventTitle;
    private Venue location;
    private Date date;
    private int time;
    private ArrayList<Ticket> tickets;

    public Event() {
        this.date = new Date();
        this.eventID = 0;
        this.eventTitle = "";
        this.location = new Venue();
        this.time = 0;
        this.tickets = new ArrayList<Ticket>();
    }
    public Event(Date date, int eventID, String eventTitle, Venue location, int time) {
        this();
        this.date = date;
        this.eventID = eventID;
        this.eventTitle = eventTitle;
        this.location = location;
        this.time = time;

    }
    public void holdTicket(Ticket ticket) {
        ticket.setValid(false);
    }
    public void releaseTicket(Ticket ticket) {
        ticket.setValid(true);
    }
    public void updateTickets(Ticket ticket, String addORRemove) {
        addORRemove.trim().toLowerCase();
        if (addORRemove.equals("remove")) {
            this.tickets.remove(ticket);
        } else if (addORRemove.equals("add")) {
            this.tickets.add(ticket);
        }
        else {
            System.out.print("wrong entry");
        }
    }
    //getters&setters
    public int getEventId() { return this.eventID; }
    public String getEventTitle() { return this.eventTitle; }
    public Venue getLocation() { return this.location; }
    public Date getDate() { return this.date; }
    public int getTime() { return this.time; }

    public void updateLocation(Venue input) {
        this.location = input;
    }
    public void updateDate(Date input) {
        this.date = input;
    }
    public void updateTime(int input) {
        this.time = input;
    }
}
