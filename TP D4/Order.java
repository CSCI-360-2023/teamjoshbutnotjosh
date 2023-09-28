public class Order {
    private int orderID; //will be final/constant
    private User customer; //will be final/constant
    private Event event; //will be final/constant
    private Ticket ticket; //will be final/constant

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
