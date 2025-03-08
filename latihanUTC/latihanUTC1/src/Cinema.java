import java.util.*;

public class Cinema {
    private List<Movie> availableMovies = new ArrayList<>();
    
    Scanner a = new Scanner(System.in);

    void addMovie(Movie movie) {
        availableMovies.add(movie);
        System.out.println("Movie added to cinema: " + movie.getTitle());
    }

    void rentMovie(Viewer viewer, Movie movie) {
        availableMovies.remove(movie);
        viewer.rentedMovies.add(movie);
        System.out.println(viewer.getName() + " rented: " + movie.getTitle());
    }

    void returnMovie(Viewer viewer, Movie movie) {
        availableMovies.add(movie);
        viewer.rentedMovies.remove(movie);
        System.out.println(viewer.getName() + " returned: " + movie.getTitle());
    }

    void displayAvailableMovies() {
        System.out.println("Movies in Cinema:");
        for (Movie movie : availableMovies) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("ID: " + movie.getId());
            System.out.println("Director: " + movie.getDirector().getName());
            System.out.println("Biography: " + movie.getDirector().getBiography());
        }
    }
}
