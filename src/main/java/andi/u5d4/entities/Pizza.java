package andi.u5d4.entities;

import java.util.List;

public class Pizza extends Item {
    private String name;
    private List<Topping> toppings;

    public Pizza( String name, List<Topping> toppings) {
        super(700, 13);
        this.name = name;
        this.toppings = toppings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public void addToppings(Topping topping) {
        this.toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppings=" + toppings +
                "calories" + super.getCalories() +
                "price" + super.getPrice() +
                '}';
    }
}

