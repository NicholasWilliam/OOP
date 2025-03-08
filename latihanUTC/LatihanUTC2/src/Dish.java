public class Dish {
    private String name;
    private String id;
    private Chef chef;

    public Dish(String name, String id, Chef chef){
        this.name = name;
        this.id = id;
        this.chef = chef;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public Chef getChef(){
        return chef;
    }
}
