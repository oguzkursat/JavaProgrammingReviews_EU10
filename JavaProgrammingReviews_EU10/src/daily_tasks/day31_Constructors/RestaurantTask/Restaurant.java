package daily_tasks.day31_Constructors.RestaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String owner,location;
    public int numberOfStars;
    ArrayList<Server> Servers = new ArrayList<>();
    ArrayList<Chef> Chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        Servers.add(server);
    }
    public void hireServer(Server [] servers){
        Servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef){
        Chefs.add(chef);
    }
    public void hireChef(Chef [] chefs){
        Chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeID){
        Chefs.removeIf(p-> p.employeeID==employeID);
    }
    public void terminateServer(int employeeID){
        Servers.removeIf(p-> p.employeeID==employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", total number servers=" + Servers.size() +
                ", total number chefs=" + Chefs.size() +
                '}';
    }
}
