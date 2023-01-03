package daily_tasks.day45_Abstraction.shape;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }

    public double area();

    public double perimeter();
}
