import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author mfigueiredo
 */
public class MovieStoreTest {

  private final String directorNameStevenSpielberg = "Steven Spielberg";
  private final String directorNamePeterJackson = "Peter Jackson";
  private final Movie aiArtificialIntelligence = new Movie("A.I. Artificial Intelligence", directorNameStevenSpielberg, 2009);
  private final Movie catchMeIfYouCan = new Movie("Catch Me If You Can", directorNameStevenSpielberg, 2010);
  private final Movie theTerminal = new Movie("The Terminal", directorNameStevenSpielberg, 2011);
  private final Movie theAdventuresOfTinTin = new Movie("The Adventures of Tintin", directorNameStevenSpielberg, 2012);
  private final Movie theLordOfTheRings= new Movie("The Lord of the Rings", directorNamePeterJackson, 2013);



  private final MovieStore movieStore = new MovieStore();

  @BeforeEach
  void setUp() {


    movieStore.add(theTerminal);
    movieStore.add(aiArtificialIntelligence);
    movieStore.add(catchMeIfYouCan);
    movieStore.add(theAdventuresOfTinTin);
    movieStore.add(theLordOfTheRings);
  }

  @Test
  public void returnNoResultsWhenNoTitlesPartiallyMatchSearch() throws Exception {
    List<Movie> movies = movieStore.findByPartiallyTitle("abs");

    assertEquals(0, movies.size());
  }

  @Test
  public void returnAMovieWhenTitlesIsPartiallyMatched() throws Exception {

    List<Movie> movies = movieStore.findByPartiallyTitle("Me");

    assertEquals(1, movies.size());
    assertTrue(movies.contains(catchMeIfYouCan));


  }

  @Test
  public void findsMoviesWhenTitlesIsPartiallyMatchedCaseInsensitive() throws Exception {

    List<Movie> movies = movieStore.findByPartiallyTitle("THE");

    assertEquals(3, movies.size());
    assertTrue(movies.containsAll(Arrays.asList(theAdventuresOfTinTin, theTerminal)));

  }


  @Test
  public void findsMoviesWhenDirectorExactlyMatches() throws Exception {

    List<Movie> movies = movieStore.findByDirector("Steven Spielberg");

    assertEquals(4, movies.size());
    assertTrue(movies.containsAll(Arrays.asList(aiArtificialIntelligence, catchMeIfYouCan, theTerminal, theAdventuresOfTinTin)));

  }



  @Test
  public void findsMoviesWhenReleaseYearIsBetweenTwoValues() throws Exception {

    List<Movie> movies = movieStore.findByReleaseYear(2010, 2013);

    assertEquals(2, movies.size());
    assertTrue(movies.containsAll(Arrays.asList(theTerminal, theAdventuresOfTinTin)));

  }

}