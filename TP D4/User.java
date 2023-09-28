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
