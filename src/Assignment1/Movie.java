package Assignment1;

import java.time.LocalDate;

public class Movie {
    private String title;
    private String director;
    private LocalDate releaseDate;
    private String genre;

    public Movie(String title, String director, LocalDate releaseDate, String genre) {
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public void giveInfo() {
        String info = "Film: " + title + " - Regisseur: " + director + " - Genre: " + genre + " - ReleaseDate: " + releaseDate;
        System.out.println(info);
    }

}
