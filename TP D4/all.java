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


public class Order {
    private int orderID; //final/constant?
    private User customer; //final/constant?
    private Event event; //final/constant?
    private Ticket ticket; //final/constant?

    public Order(User customer, Event currentEvent, Ticket currentTicket) {

    }
    public void generateQr() {

    }
    public void displayOrder() {

    }
    public boolean grantAccess() {
        return true;
    }
    //getters
    public int getOrderID() { return this.orderID; }
    public User getCustomer() { return this.customer; }
    public Event getEvent() { return this.event; }
    public Ticket getTicket() { return this.ticket; }


}

import java.util.Date;

public class Payment {
    private String street;
    private String city;
    private String state;
    private String country;
    private int zipCode;
    private int cardNum;
    private Date expDate;
    private int securityCode;

    public Payment() {

    }
    public void displayPurchaseStatus() {

    }
    public void updatePayment(String street, String city, String state, String country, int zipCode, int cardNum, Date expDate, int securityCode) {

    }
    //getters
    public String getStreet() { return this.street; }
    public String getCity() { return this.city; }
    public String getState() { return this.state; }
    public String getCountry() { return this.country; }
    public int getZipCode() { return this.zipCode;}
    public int getCardNum() { return this.cardNum; }
    public Date getExpDate() { return this.expDate; }
    public int getSecurityCode() { return this.securityCode;}
}

public class Ticket {
    private int eventId;
    private String tier;
    private int seatNum;
    private int ticketID_Num;
    private boolean valid;

    public Ticket() {

    }
    public void createOrder() {

    }
    public void qrMatch(int orderID) {

    }
    //getters&setters
    public int getEventId() { return this.eventId; }
    public String getTier() { return this.tier; }
    public int getSeatNum() { return this.seatNum; }
    public int getTicketID_Num() { return this.seatNum; }
    public boolean getValid() { return this.valid; }

    public void setValid(boolean input) {

    }
}


import java.util.ArrayList;
import java.util.Random;

public class User {
    private int userID;
    private String username;
    private String password;
    private String email;
    private int phoneNum;
    private Payment paymentInfo;
    private ArrayList<Ticket> tickets;
    private ArrayList<Order> orders;


    public User(String name, String passW, String eMail, int number) {
        String username = name;
        String password = passW;
        String email = eMail;
        int phoneNum = number;
        int userID = new Random().nextInt(1,999999);
    }
    public void signUp(String name, String email, int number) {

    }
    public void login(String email, int telephone, String password) {

    }
    public ArrayList<Event> searchEvent() {
        return null;
    }
    public void viewEvent(Event event) {

    }
    public void selectTicket(Ticket ticket) {

    }
    public void purchaseTicket(Ticket ticket) {

    }
    public void scanQr(int orderId) {

    }
    //getters&setters
    public int getUserID() { return this.userID; }
    public String getUsername() { return this.username; }
    public String getPassword() { return this.password; }
    public String getEmail() { return this.email; }
    public int getPhoneNum() { return this.phoneNum; }
    public Payment getPaymentInfo() { return this.paymentInfo; }
    public ArrayList<Ticket> getTickets() { return this.tickets; }
    public ArrayList<Order> getOrders() { return this.orders; }

    public void updateUsername() {

    }
    public void updatePassword() {

    }
    public void updateEmail() {

    }
    public void updatePhoneNum() {

    }
    public void updateTickets() {

    }
    public void updateOrders() {

    }
}

public class Venue {
    private int seatCount; //will be final/constant
    private String location; //will be final/constant
    private String name; //will be final/constant

    public Venue() {

    }
    public void displayVenue() {

    }
    //getters
    public int getSeatCount() { return this.seatCount; }
    public String getLocation() { return this.location; }
    public String getName() { return this.name; }
}
