public class Order {
    private int orderID; //will be final/constant
    private User customer; //will be final/constant
    private Event event; //will be final/constant
    private Ticket ticket; //will be final/constant

    public Order(User customer, Event currentEvent, Ticket currentTicket, int orderID) {
        this();
        this.customer = customer;
        this.event = currentEvent;
        this.ticket = currentTicket;
        this.orderID = orderID;
    }

    public Order() {
        this.customer = new User();
        this.event = new Event();
        this.ticket = new Ticket();
        this.orderID = 0;
    }
    public void generateQr() {  //unsure fo the flow on this

    }
    public boolean grantAccess() {
        return true;
    } //unsure of the flow for this, qr validation method
    //getters
    public int getOrderID() { return this.orderID; }
    public User getCustomer() { return this.customer; }
    public Event getEvent() { return this.event; }
    public Ticket getTicket() { return this.ticket; }


}
