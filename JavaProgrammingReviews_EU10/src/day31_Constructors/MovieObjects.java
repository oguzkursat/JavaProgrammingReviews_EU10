package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {
    public static void main(String[] args) {

        Movie movie1 = new Movie("USA","Journey to SDET: EU10","10/05/2021","Kuzzat Altay");
        ArrayList<Movie> casts = new ArrayList<>();

        movie1.addCast("Asiya");
        String [] castList = {"Adam","Muhtar","Zulpikar","Oğuz Kürşat","Özgür","Ferhat","Hasan"};
        movie1.addCasts(castList);

        System.out.println(movie1);

    }
}
