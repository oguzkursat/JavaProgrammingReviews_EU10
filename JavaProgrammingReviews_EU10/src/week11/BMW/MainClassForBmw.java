package week11.BMW;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MainClassForBmw {
    public static void main(String[] args) {

        BMW bmw1 = new BMW("BMW", "X5", "White", 20000, 10000, 2015, LocalDate.of(2015,5,20));
        BMW bmw2 = new BMW("BMW", "i8", "Grey", 20000, 10000, 2013, LocalDate.of(2013,5,20));
        BMW bmw3 = new BMW("BMW", "i3", "White", 20000, 10000, 2018, LocalDate.of(2018,5,20));
        BMW bmw4 = new BMW("BMW", "i8", "Black", 20000, 10000, 2020, LocalDate.of(2020,5,20));
        BMW bmw5 = new BMW("BMW", "i5", "White", 20000, 10000, 2014, LocalDate.of(2014,5,20));

        ArrayList<BMW> list = new ArrayList<>(Arrays.asList(bmw1,bmw2,bmw3,bmw4,bmw5));
        bmw1.getBrandName();

        System.out.println(before2017(list));
        System.out.println(bmw_i8_before2016(list));

    }

    public static ArrayList<BMW> before2017(ArrayList<BMW> list) {
        list.removeIf(p-> p.year>=2017);
        return list;
    }

    public static ArrayList<BMW> bmw_i8_before2016(ArrayList<BMW> list) {
        list.removeIf(p-> p.model!="i8");
        list.removeIf(p-> p.year>=2016);
        return list;
    }
}
