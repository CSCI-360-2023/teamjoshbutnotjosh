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

    public User() {
        this.username = "";
        this.password = "";
        this.email = "";
        this.phoneNum = 0;
        this.userID = new Random().nextInt(1,999999);
    }
    public User(String name, String passW, String eMail, int number) {
        this();
        this.username = name;
        this.password = passW;
        this.email = eMail;
        this.phoneNum = number;
    }
    public boolean login(String email, int telephone, String password) {
        if (this.email.equals(email) && this.phoneNum==telephone && this.password.equals(password) ) {
            return true;
        }
        return false;
    }
    public void purchaseTicket(Ticket ticket) {
        //not sure how to implement this with the rest of the system
    }
    public void scanQr(int orderId) {
        //unsure if this is necessary, review Order class for decision
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

    public void updateUsername(String username) {
        this.username = username;
    }
    public void updatePassword(String password) {
        this.password = password;
    }
    public void updateEmail(String email) {
        this.email = email;
    }
    public void updatePhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
    public void updateTickets(Ticket ticket, String addOrRemove) {
        addOrRemove.trim().toLowerCase();
        if (addOrRemove.equals("remove")) {
            this.tickets.remove(ticket);
        } else if (addOrRemove.equals("add")) {
            this.tickets.add(ticket);
        }
        else {
            System.out.print("wrong entry");
        }
    }
    public void updateOrders(Order order) {
        this.orders.add(order);
    }
}
