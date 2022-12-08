package day31_Constructors.RestaurantTask;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("CYDEO", "VA", 5);
        Server server1 = new Server("Ali", 1223, 5, true);
        Server server2 = new Server("Mehmet", 1451, 7, true);
        Server server3 = new Server("Ayşe", 2435, 3, false);
        Server server4 = new Server("Betül", 2332, 4, false);

        Server[] servers = {server1, server2, server3, server4};

        restaurant1.hireServer(servers);

        Chef chef1 = new Chef("Danilo", 2784, 10, true);
        Chef chef2 = new Chef("Mehmet", 2664, 12, true);
        Chef chef3 = new Chef("Somer", 2145, 8, false);

        Chef[] chefs = {chef1, chef2, chef3};

        restaurant1.hireChef(chefs);

        System.out.println(restaurant1);

    }
}
