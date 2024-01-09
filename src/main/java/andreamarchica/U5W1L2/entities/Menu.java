package andreamarchica.U5W1L2.entities;

        import java.io.PrintStream;
        import java.util.List;
        import java.util.Objects;

public class Menu {
    private List<Pizza> pizzaList;
    private List<Drink> drinkList;
    private List<Topping> toppingList;

    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
        List var10000 = this.pizzaList;
        PrintStream var10001 = System.out;
        Objects.requireNonNull(var10001);
        var10000.forEach(var10001::println);
        System.out.println();
        System.out.println("TOPPINGS");
        var10000 = this.toppingList;
        var10001 = System.out;
        Objects.requireNonNull(var10001);
        var10000.forEach(var10001::println);
        System.out.println();
        System.out.println("DRINKS");
        var10000 = this.drinkList;
        var10001 = System.out;
        Objects.requireNonNull(var10001);
        var10000.forEach(var10001::println);
        System.out.println();
    }

    public List<Pizza> getPizzaList() {
        return this.pizzaList;
    }

    public List<Drink> getDrinkList() {
        return this.drinkList;
    }

    public List<Topping> getToppingList() {
        return this.toppingList;
    }

    public String toString() {
        List var10000 = this.getPizzaList();
        return "Menu(pizzaList=" + var10000 + ", drinkList=" + this.getDrinkList() + ", toppingList=" + this.getToppingList() + ")";
    }

    public Menu() {
    }

    public Menu(final List<Pizza> pizzaList, final List<Drink> drinkList, final List<Topping> toppingList) {
        this.pizzaList = pizzaList;
        this.drinkList = drinkList;
        this.toppingList = toppingList;
    }
}
