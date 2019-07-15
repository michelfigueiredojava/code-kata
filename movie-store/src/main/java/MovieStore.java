import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author mfigueiredo
 */
public class MovieStore {

  private List<Movie> movies = new LinkedList<>();

  public void add(Movie movie) {
    movies.add(movie);
  }

  public List<Movie> findByPartiallyTitle(String partialTitle) {
    Predicate<Movie> predicate = movie -> movie.getTitle().toUpperCase().contains(partialTitle.toUpperCase());
    return findBy(predicate);
  }

  public List<Movie> findByDirector(String director) {
    Predicate<Movie> predicate = movie -> movie.getDirector().toUpperCase().contains(director.toUpperCase());
    return findBy(predicate);
  }

  public List<Movie> findByReleaseYear(int from, int to) {
    Predicate<Movie> predicate = movie -> movie.getReleaseYear() > from && movie.getReleaseYear() < to;
    return findBy(predicate);
  }

  private List<Movie> findBy(Predicate<Movie> predicate) {
    return movies
            .stream()
            .filter(predicate)
            .collect(Collectors.toList());
  }

}
