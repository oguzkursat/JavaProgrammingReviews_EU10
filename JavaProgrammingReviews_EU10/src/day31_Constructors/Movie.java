package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country,title,releaseDate,director;
    public ArrayList<String> casts = new ArrayList<>();
    public Movie(String country, String title, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast(String cast){
        casts.add(cast);
    }

    public void addCasts(String [] castArr){
        casts.addAll(Arrays.asList(castArr));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", total number of casts=" + casts.size() +
                '}';
    }
}
