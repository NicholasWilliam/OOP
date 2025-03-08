import java.util.ArrayList;
import java.util.List;

public class Viewer {
    public List<Movie> rentedMovies = new ArrayList<>();
    private String name;
    Viewer(String name) {
        this.name = name;
    }

    String getName(){
        return name;
    }

    void displayRentedMovies() {
        System.out.println(name + "'s Rented Movies:");
        for (Movie movie : rentedMovies) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("ID: " + movie.getId());
            System.out.println("Director: " + movie.getDirector().getName());
            System.out.println("Biography: " + movie.getDirector().getBiography());
            System.out.println("------------------------");
        }
    }
}
