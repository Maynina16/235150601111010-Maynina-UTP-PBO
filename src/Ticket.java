package src;
public class Ticket {
    private String movie;
    private int studioNumber;
    private double price;
    private String seat;

    public void TicketMovie(int sn, String s) {
        this.studioNumber = sn;
        this.seat = s;
    }
    public void get (String TicketInfo) {
    }
    public void getMovie() { }
    public void get(int studioNumber){ }
    public double getPrice() {    
        return price;
    }
    public void setName(double price) {
        this.price = price;
    }
    public String getSeat() {    
        return seat;
    }
    public String getTicketPrice() {    
        return TicketPrice;
    }
    public void setTicketPrice(double price) {
        this.price = price;
    }
}

