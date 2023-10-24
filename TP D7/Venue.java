public class Venue {
    private int seatCount; //will be final/constant
    private String location; //will be final/constant
    private String name; //will be final/constant

    public Venue() {
        this.seatCount = 0;
        this.location = "";
        this.name = "";
    }
    public Venue(int seatCnt, String location, String name) {
        this.seatCount = seatCnt;
        this.location = location;
        this.name = name;
    }
    //setters
    public void setSeatCount(int count, String addOrSub) {
        if (addOrSub.equals("add")) {
            this.seatCount+= count;
        }
        else {
            this.seatCount-= count;
        }
    }
    //getters
    public int getSeatCount() { return this.seatCount; }
    public String getLocation() { return this.location; }
    public String getName() { return this.name; }
}
