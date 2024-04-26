package src;
public class Movie {
   private String title;
   private double rating;
   private String genres;
 public Movie(String title, double rating) {

 }
 public Movie(String t, double r, String g){
    title = t;
    rating = r;
    genres = g;
 }
 public String getTitle() {    
    return title;
}
public void setTitle(String title) {
    this.title = title;
}
public String getRating() {    
    return rating;
}
public void setRating(double rating) {
    this.rating = rating;
}
public String getGenres() {    
    return genres;
}
public void setGenres(String genres) {
    this.genres = genres;
}
}