package src;
public class Cinema {
    private String name;
    private int [] Users;
    private int [] Studio;
    private int studioCapacity; 

    public void Cinema (String n, int s) {
        this.name = n;
        this.studioCapacity = s;
    }
    private void init() {
    }
    public void registerUser(boolean User) {
    }
   public void authenticateUser (String email, String password) {
        
    }
    public void displayListStudio() {
    }

   public void displayStudioDetail(int studioNumber) {
    }

   public void addStudioWithMovies (String studioType, String movieTitle, double movieRating, String[] movieGenres) { 
    }

   public void BookTicket (int studioNumber, char row, int col) {
    }
    public String getName() {    
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}

 class MainCinema {
    public static void main(String[] args) {
        Cinema cinema1 = new Cinema ();
        System.out.println("Maynina Nur Azizah A Cinema");
        System.out.println(cinema1.getName());
            System.out.println("Login");
            System.out.println("Register");
            System.out.println("Exit");
            System.out.println("Pick your choice : ");
        
        
            

            
        }
    }

