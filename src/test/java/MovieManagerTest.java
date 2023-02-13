import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.MovieManager;

public class MovieManagerTest {
    @Test
    public void addMoviesTest() {
        MovieManager manager = new MovieManager();
        manager.addNewMovie("Film 1");
        manager.addNewMovie("Film 2");
        manager.addNewMovie("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoviesAndReturnLastTenMovies() {
        MovieManager manager = new MovieManager();
        manager.addNewMovie("Film 1");
        manager.addNewMovie("Film 2");
        manager.addNewMovie("Film 3");
        manager.addNewMovie("Film 4");
        manager.addNewMovie("Film 5");
        manager.addNewMovie("Film 6");
        manager.addNewMovie("Film 7");
        manager.addNewMovie("Film 8");
        manager.addNewMovie("Film 9");
        manager.addNewMovie("Film 10");
        manager.addNewMovie("Film 11");
        manager.addNewMovie("Film 12");

        String[] expected = {"Film 12", "Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoviesAndReturnLastMoviesLessThanTen() {
        MovieManager manager = new MovieManager();
        manager.addNewMovie("Film 1");
        manager.addNewMovie("Film 2");
        manager.addNewMovie("Film 3");
        manager.addNewMovie("Film 4");
        manager.addNewMovie("Film 5");
        manager.addNewMovie("Film 6");
        manager.addNewMovie("Film 7");
        manager.addNewMovie("Film 8");

        String[] expected = {"Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoviesAndReturnLastCountMovies() {
        MovieManager manager = new MovieManager(5);
        manager.addNewMovie("Film 1");
        manager.addNewMovie("Film 2");
        manager.addNewMovie("Film 3");
        manager.addNewMovie("Film 4");
        manager.addNewMovie("Film 5");
        manager.addNewMovie("Film 6");
        manager.addNewMovie("Film 7");
        manager.addNewMovie("Film 8");

        String[] expected = {"Film 8", "Film 7", "Film 6", "Film 5", "Film 4"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addZeroMoviesAndReturnIt() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
