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
