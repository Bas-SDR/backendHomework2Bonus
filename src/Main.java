import Assignment1.Movie;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Opdracht1");
        Movie inception = new Movie("Inception", "Christopher Nolan", LocalDate.of(2010, 7, 16), "Thriller");
        inception.giveInfo();
    }
}