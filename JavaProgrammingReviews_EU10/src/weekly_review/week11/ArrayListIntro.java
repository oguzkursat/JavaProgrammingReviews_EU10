package weekly_review.week11;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        //how to create an arraylist
        ArrayList<String> cities = new ArrayList<>();
        //2nd way == > ArrayList<String> cities = new ArrayList<String>();

        //how to add element
        cities.add("London");//returns boolean
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Rome");
        cities.add(2,"Adana");

        //for array rrays.toString(cities)
        System.out.println(cities);

        //how to add one element at the beginning
        cities.add(0,"New York");

        System.out.println(cities);

        //how to get element
        System.out.println(cities.get(0));

        //how to update your element
        System.out.println(cities.set(2,"Virginia"));//set method is returning element which you updated
        System.out.println("===================== After Update=====================");
        System.out.println(cities);

        //how to learn  position of the element or index of element
        System.out.println(cities.indexOf("Adana"));
        System.out.println(cities.indexOf("Paris")); // if it is not exist, you will get -1

        //lastIndexOf()
        System.out.println(cities.lastIndexOf("London"));
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,2,3,4,5,1,1));

        System.out.println(numbers);
        //0  1  2  3  4  5  6  7   indexes
        //1, 1, 2, 3, 4, 5, 1, 1

        System.out.println(numbers.indexOf(1)); //1
        System.out.println(numbers.lastIndexOf(1)); //7

        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.addAll(Arrays.asList(2,3,4,5,1));
        //0, 1  2  3  4  indexes
        //2, 3, 4, 5, 1
        System.out.println(numbers1);
        //how to remove element
        //numbers1.remove()
        numbers1.remove(1); // index removing
        System.out.println(numbers1);
        Integer b = 4;
        numbers1.remove(b); // object removing
        numbers1.remove(new Integer(5)); //object removing
        numbers1.remove(Integer.valueOf(1)); //object removing
        System.out.println(numbers1);

        //bulk operation

        //addAll()

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mesut","Osman","Seyma"));

        System.out.println(names);

        //removeAll()



        //retainAll()



        //removeIf()

        System.out.println("=====================================================");

        System.out.println(numbers);

        numbers.removeIf(p-> p<3);
        System.out.println(numbers);


       /* for(Integer number:numbers){
            if(number<3){
                numbers.remove(number); // we are not able to use like this because foreach
                                        // iterations the indexes are changing
            }
        }
*/
    }
}
