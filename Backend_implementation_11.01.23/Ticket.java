public class Ticket {
    private int eventID;
    private String tier;
    private int seatNum;
    private int ticketID_Num;
    private boolean valid;

    public Ticket() {
        this.eventID = 0;
        this.tier ="";
        this.seatNum = 0;
        this.ticketID_Num = 0;
        this.valid = true;
    }
    public Ticket(int eventID, String tier, int seatNum, int ticketID_Num, boolean valid) {
        this.eventID = eventID;
        this.tier = tier;
        this.seatNum = seatNum;
        this.ticketID_Num = ticketID_Num;
        this.valid = valid;
    }
    public boolean qrMatch(int orderID) {
        return true; // not sure if necessary or how to implement
    }
    public void setValid(boolean input) {
        this.valid = input;
    }
    //getters&setters
    public int getEventId() { return this.eventID; }
    public String getTier() { return this.tier; }
    public int getSeatNum() { return this.seatNum; }
    public int getTicketID_Num() { return this.seatNum; }
    public boolean getValid() { return this.valid; }

}
