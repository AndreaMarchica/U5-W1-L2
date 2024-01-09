package andreamarchica.U5W1L2.entities;

public class Topping extends Item {
    private String name;

    public Topping(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    public String toString() {
        return "Topping{name='" + this.name + "', calories=" + this.calories + ", price=" + this.price + "}";
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
