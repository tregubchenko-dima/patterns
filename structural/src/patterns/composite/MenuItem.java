package patterns.composite;

public class MenuItem extends MenuComponent{
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }

    public void print(){
        System.out.print(" " + getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        System.out.print(", " + getPrice());
        System.out.println("  -- " + getDescription());
    }
}
