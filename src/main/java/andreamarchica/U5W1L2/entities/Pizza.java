package andreamarchica.U5W1L2.entities;


        import java.util.List;

public class Pizza extends Item {
    private String name;
    private List<Topping> toppingList;
    private boolean isXl = false;

    public Pizza(String name, List<Topping> toppingList, boolean isXl) {
        super(1012, 4.3);
        this.name = name;
        this.toppingList = toppingList;
        this.isXl = isXl;
        this.calories = this.setCalories(toppingList, isXl);
        this.price = this.setPrice(toppingList, isXl);
    }

    public int setCalories(List<Topping> toppingList, boolean isXl) {
        int tot = 1012;
        if (toppingList != null) {
            for(int i = 0; i < toppingList.size(); ++i) {
                tot += ((Topping)toppingList.get(i)).getCalories();
            }
        }

        return isXl ? tot + tot * 5 / 100 : tot;
    }

    public double setPrice(List<Topping> t, boolean isXl) {
        double tot = 4.3;
        if (t != null) {
            for(int i = 0; i < t.size(); ++i) {
                tot += ((Topping)t.get(i)).getPrice();
            }
        }

        return isXl ? tot + tot * 10.0 / 100.0 : tot;
    }

    public String toString() {
        return "Pizza{name='" + this.name + "', calories=" + this.calories + ", price=" + this.price + ", toppingList=" + this.toppingList + ", isXl=" + this.isXl + "}";
    }

    public String getName() {
        return this.name;
    }

    public List<Topping> getToppingList() {
        return this.toppingList;
    }

    public boolean isXl() {
        return this.isXl;
    }
}
