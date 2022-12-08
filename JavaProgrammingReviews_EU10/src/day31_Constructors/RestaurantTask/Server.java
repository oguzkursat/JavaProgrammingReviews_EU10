package day31_Constructors.RestaurantTask;

public class Server {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }

    public void takeOrder(){
        System.out.println(name + " is taking order");
    }
    public void cleanTable(){
        System.out.println(name + " is cleaning the table");
    }

    public String isFullTime(){
        String isFullTimeOrNot = isFullTime? "full-time":"part-time";
        /*if( isFullTime) {
            isFullTimeOrNot="full-time";
        }else {
            isFullTimeOrNot="part-time";
        }*/
        return isFullTimeOrNot;
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + isFullTime()+
                    '}';
        }
}
