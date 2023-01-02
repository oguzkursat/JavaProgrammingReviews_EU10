package daily_tasks.day39.zoo_task;

public class WildAnimal extends Animal{
    private static boolean isWild=true;
    private static boolean isFriendly= false;
    private static boolean isPlayable=false;

    public WildAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
        setIsWild(isWild);
        setIsFriendly(isFriendly);
        setIsPlayable(isPlayable);
    }

    public static boolean isIsWild() {
        return isWild;
    }

    public static void setIsWild(boolean isWild) {
        WildAnimal.isWild = isWild;
    }

    public static boolean isIsFriendly() {
        return isFriendly;
    }

    public static void setIsFriendly(boolean isFriendly) {
        WildAnimal.isFriendly = isFriendly;
    }

    public static boolean isIsPlayable() {
        return isPlayable;
    }

    public static void setIsPlayable(boolean isPlayable) {
        WildAnimal.isPlayable = isPlayable;
    }

    public void hunt(){
        System.out.println(getName()+" is hunting");
    }

}
