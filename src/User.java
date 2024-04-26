package src;
public class User {
    String email;
    String password;
    String fullname;
    double balance;
    int ticketList [];
    int maxTicket;

    void Users (String email, String password,String fullName, double balance) {
    }
    public void Ticket(boolean ticket) {
    }
    void displayAllTickets() {
    }
    public void IsMatch (boolean String e, String password) {
        this.email = e;
        this.password = password;
    }
    public String getEmail() {    
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {    
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFullName() {    
        return fullname;
    }
    public void setFullName(String FullName) {
        this.fullname = fullname;
    }
    public String getBalance() {    
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }    

    }
