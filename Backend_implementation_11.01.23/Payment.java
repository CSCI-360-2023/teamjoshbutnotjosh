import java.util.Date;

public class Payment {
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private String cardNum;
    private String expDate;
    private String securityCode;

    public Payment() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.country = "";
        this.zipCode = "";
        this.cardNum = "";
        this.expDate = "";
        this.securityCode = "";
    }
    public Payment(String street, String city, String state, String country, String zipCode, String cardNum, String expDate, String securityCode) {
        this();
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
        this.cardNum = cardNum;
        this.expDate = expDate;
        this.securityCode = securityCode;
    }
    public void displayPurchaseStatus() {
        // not sure how well represent this yet
    }
    public void updatePayment(String street, String city, String state, String country, String zipCode, String cardNum, String expDate, String securityCode) {
        if (!this.street.equals(street) && !street.isEmpty()) {
            this.street = street;
        }
        if (!this.city.equals(city) && !city.isEmpty()) {
            this.city = city;
        }
        if (!this.state.equals(state) && !state.isEmpty()) {
            this.state = state;
        }
        if (!this.country.equals(country) && !country.isEmpty()) {
            this.country = country;
        }
        if (!this.zipCode.equals(zipCode) && !zipCode.isEmpty()) {
            this.zipCode = zipCode;
        }
        if (!this.cardNum.equals(cardNum) && !cardNum.isEmpty()) {
            this.cardNum = cardNum;
        }
        if (!this.expDate.equals(expDate) && !expDate.isEmpty()) {
            this.expDate = expDate;
        }
        if (!this.securityCode.equals(securityCode) && !securityCode.isEmpty()) {
            this.securityCode = securityCode;
        }
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
